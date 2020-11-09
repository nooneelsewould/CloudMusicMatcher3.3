package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SongDetail {
    private List<Song> songs;

    @JsonProperty("songs")
    public List<Song> getSongs() { return songs; }
    @JsonProperty("songs")
    public void setSongs(List<Song> value) { this.songs = value; }
}
