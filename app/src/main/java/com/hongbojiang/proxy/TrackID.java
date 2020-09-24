package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;

public class TrackID {
    private Long id;
    private Long v;
    private Object alg;

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("v")
    public Long getV() { return v; }
    @JsonProperty("v")
    public void setV(Long value) { this.v = value; }

    @JsonProperty("alg")
    public Object getAlg() { return alg; }
    @JsonProperty("alg")
    public void setAlg(Object value) { this.alg = value; }
}
