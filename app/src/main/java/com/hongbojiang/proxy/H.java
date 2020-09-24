package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class H {
    private Long br;
    private Long fid;
    private Long size;
    private Double vd;

    @JsonProperty("br")
    public Long getBr() { return br; }
    @JsonProperty("br")
    public void setBr(Long value) { this.br = value; }

    @JsonProperty("fid")
    public Long getFid() { return fid; }
    @JsonProperty("fid")
    public void setFid(Long value) { this.fid = value; }

    @JsonProperty("size")
    public Long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(Long value) { this.size = value; }

    @JsonProperty("vd")
    public Double getVd() { return vd; }
    @JsonProperty("vd")
    public void setVd(Double value) { this.vd = value; }
}
