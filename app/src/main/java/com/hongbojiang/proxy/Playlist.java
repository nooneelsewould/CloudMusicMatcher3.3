package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Playlist {
    private List<TrackID> trackIDS;

    @JsonProperty("trackIds")
    public List<TrackID> getTrackIDS() { return trackIDS; }
}
