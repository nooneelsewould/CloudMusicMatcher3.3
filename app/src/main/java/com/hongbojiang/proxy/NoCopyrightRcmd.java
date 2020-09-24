package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NoCopyrightRcmd {
    private Long type;
    private TypeDesc typeDesc;
    private String songID;

    @JsonProperty("type")
    public Long getType() { return type; }
    @JsonProperty("type")
    public void setType(Long value) { this.type = value; }

    @JsonProperty("typeDesc")
    public TypeDesc getTypeDesc() { return typeDesc; }
    @JsonProperty("typeDesc")
    public void setTypeDesc(TypeDesc value) { this.typeDesc = value; }

    @JsonProperty("songId")
    public String getSongID() { return songID; }
    @JsonProperty("songId")
    public void setSongID(String value) { this.songID = value; }
}
