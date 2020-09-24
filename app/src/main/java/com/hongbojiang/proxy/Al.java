package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Al {
    private Long id;
    private String name;
    private String picURL;
    private List<String> tns;
    private String picStr;
    private Double pic;

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("picUrl")
    public String getPicURL() { return picURL; }
    @JsonProperty("picUrl")
    public void setPicURL(String value) { this.picURL = value; }

    @JsonProperty("tns")
    public List<String> getTns() { return tns; }
    @JsonProperty("tns")
    public void setTns(List<String> value) { this.tns = value; }

    @JsonProperty("pic_str")
    public String getPicStr() { return picStr; }
    @JsonProperty("pic_str")
    public void setPicStr(String value) { this.picStr = value; }

    @JsonProperty("pic")
    public Double getPic() { return pic; }
    @JsonProperty("pic")
    public void setPic(Double value) { this.pic = value; }
}
