package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistDetail {
    private Long code;
    private Object relatedVideos;
    private Playlist playlist;
    private Object urls;
    private List<Privilege> privileges;

    @JsonProperty("code")
    public Long getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Long value) { this.code = value; }

    @JsonProperty("relatedVideos")
    public Object getRelatedVideos() { return relatedVideos; }
    @JsonProperty("relatedVideos")
    public void setRelatedVideos(Object value) { this.relatedVideos = value; }

    @JsonProperty("playlist")
    public Playlist getPlaylist() { return playlist; }
    @JsonProperty("playlist")
    public void setPlaylist(Playlist value) { this.playlist = value; }

    @JsonProperty("urls")
    public Object getUrls() { return urls; }
    @JsonProperty("urls")
    public void setUrls(Object value) { this.urls = value; }

    @JsonProperty("privileges")
    public List<Privilege> getPrivileges() { return privileges; }
    @JsonProperty("privileges")
    public void setPrivileges(List<Privilege> value) { this.privileges = value; }
}
