package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistDetail {
    private Playlist playlist;

    @JsonProperty("playlist")
    public Playlist getPlaylist() { return playlist; }
}
