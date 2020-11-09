package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackID {
    private Long id;

    @JsonProperty("id")
    public Long getID() { return id; }
}
