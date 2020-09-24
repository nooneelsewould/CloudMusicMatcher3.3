package com.hongbojiang;

import com.hongbojiang.proxy.Ar;
import com.hongbojiang.proxy.Converter;
import com.hongbojiang.proxy.PlaylistDetail;
import com.hongbojiang.proxy.Song;
import com.hongbojiang.proxy.SongDetail;
import com.hongbojiang.proxy.TrackID;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import com.google.common.collect.Lists;

public class PlaylistAPIHelper {
    private String pID;

    public PlaylistAPIHelper(String pID) {
        this.pID = pID;
    }

    private List<List<String>> splitList(List<String> list , int groupSize){
        return  Lists.partition(list, groupSize);
    }

    public List<Song> getSongs() throws IOException {
        String res = post("http://rinne.top:3000/playlist/detail", "id=" + pID);
        PlaylistDetail playlistDetail = Converter.getPlaylistDetailFromJsonString(res);
        List<TrackID> trackIDs = playlistDetail.getPlaylist().getTrackIDS();
        List<List<TrackID>> group = new ArrayList<>();
        List<Song> songs = new ArrayList<>();
        if (!trackIDs.isEmpty()) {
            group = Lists.partition(trackIDs, 800);
            for (List<TrackID> item : group) {
                StringBuilder dataBuilder = new StringBuilder();
                for (TrackID id : item) {
                    dataBuilder.append(id.getID());
                    dataBuilder.append(",");
                }
                String data = dataBuilder.toString();
                if (data.endsWith(",")) {
                    data = data.substring(0, data.length() - 1);
                }
                res = post("http://rinne.top:3000/song/detail", "ids=" + data);
                SongDetail songDetail = Converter.getSongDetailFromJsonString(res);
                songs.addAll(songDetail.getSongs());
            }
        }
        return songs;
    }

    private static String post(String _url, String _data) {
        OutputStream out = null;
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(_url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(50000);
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            out = new BufferedOutputStream(urlConnection.getOutputStream());
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8));
            writer.write(_data);
            writer.flush();
            writer.close();
            out.close();
            int responseCode=urlConnection.getResponseCode();
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                while ((line=br.readLine()) != null) {
                    response.append(line);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response.toString();
    }
}

