package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SongDetail {
    private List<Song> songs;
    private List<Privilege> privileges;
    private Long code;

    @JsonProperty("songs")
    public List<Song> getSongs() { return songs; }
    @JsonProperty("songs")
    public void setSongs(List<Song> value) { this.songs = value; }

    @JsonProperty("privileges")
    public List<Privilege> getPrivileges() { return privileges; }
    @JsonProperty("privileges")
    public void setPrivileges(List<Privilege> value) { this.privileges = value; }

    @JsonProperty("code")
    public Long getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Long value) { this.code = value; }
}
