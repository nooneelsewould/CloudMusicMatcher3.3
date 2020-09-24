package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Ar {
    private Long id;
    private String name;
    private List<Object> tns;
    private List<Object> alias;

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tns")
    public List<Object> getTns() { return tns; }
    @JsonProperty("tns")
    public void setTns(List<Object> value) { this.tns = value; }

    @JsonProperty("alias")
    public List<Object> getAlias() { return alias; }
    @JsonProperty("alias")
    public void setAlias(List<Object> value) { this.alias = value; }
}
