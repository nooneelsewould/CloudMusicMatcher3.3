package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Track {
    private String name;
    private Long id;
    private Long pst;
    private Long t;
    private List<Ar> ar;
    private List<String> alia;
    private Long pop;
    private Long st;
    private String rt;
    private Long fee;
    private Long v;
    private Object crbt;
    private String cf;
    private Al al;
    private Long dt;
    private H h;
    private H m;
    private H l;
    private Object a;
    private String cd;
    private Long no;
    private Object rtURL;
    private Long ftype;
    private List<Object> rtUrls;
    private Long djID;
    private Long copyright;
    private Long sID;
    private Double mark;
    private Long originCoverType;
    private NoCopyrightRcmd noCopyrightRcmd;
    private Long rtype;
    private Object rurl;
    private Long mst;
    private Long cp;
    private Long mv;
    private Long publishTime;
    private List<String> tns;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("pst")
    public Long getPst() { return pst; }
    @JsonProperty("pst")
    public void setPst(Long value) { this.pst = value; }

    @JsonProperty("t")
    public Long getT() { return t; }
    @JsonProperty("t")
    public void setT(Long value) { this.t = value; }

    @JsonProperty("ar")
    public List<Ar> getAr() { return ar; }
    @JsonProperty("ar")
    public void setAr(List<Ar> value) { this.ar = value; }

    @JsonProperty("alia")
    public List<String> getAlia() { return alia; }
    @JsonProperty("alia")
    public void setAlia(List<String> value) { this.alia = value; }

    @JsonProperty("pop")
    public Long getPop() { return pop; }
    @JsonProperty("pop")
    public void setPop(Long value) { this.pop = value; }

    @JsonProperty("st")
    public Long getSt() { return st; }
    @JsonProperty("st")
    public void setSt(Long value) { this.st = value; }

    @JsonProperty("rt")
    public String getRt() { return rt; }
    @JsonProperty("rt")
    public void setRt(String value) { this.rt = value; }

    @JsonProperty("fee")
    public Long getFee() { return fee; }
    @JsonProperty("fee")
    public void setFee(Long value) { this.fee = value; }

    @JsonProperty("v")
    public Long getV() { return v; }
    @JsonProperty("v")
    public void setV(Long value) { this.v = value; }

    @JsonProperty("crbt")
    public Object getCrbt() { return crbt; }
    @JsonProperty("crbt")
    public void setCrbt(Object value) { this.crbt = value; }

    @JsonProperty("cf")
    public String getCF() { return cf; }
    @JsonProperty("cf")
    public void setCF(String value) { this.cf = value; }

    @JsonProperty("al")
    public Al getAl() { return al; }
    @JsonProperty("al")
    public void setAl(Al value) { this.al = value; }

    @JsonProperty("dt")
    public Long getDt() { return dt; }
    @JsonProperty("dt")
    public void setDt(Long value) { this.dt = value; }

    @JsonProperty("h")
    public H getH() { return h; }
    @JsonProperty("h")
    public void setH(H value) { this.h = value; }

    @JsonProperty("m")
    public H getM() { return m; }
    @JsonProperty("m")
    public void setM(H value) { this.m = value; }

    @JsonProperty("l")
    public H getL() { return l; }
    @JsonProperty("l")
    public void setL(H value) { this.l = value; }

    @JsonProperty("a")
    public Object getA() { return a; }
    @JsonProperty("a")
    public void setA(Object value) { this.a = value; }

    @JsonProperty("cd")
    public String getCD() { return cd; }
    @JsonProperty("cd")
    public void setCD(String value) { this.cd = value; }

    @JsonProperty("no")
    public Long getNo() { return no; }
    @JsonProperty("no")
    public void setNo(Long value) { this.no = value; }

    @JsonProperty("rtUrl")
    public Object getRtURL() { return rtURL; }
    @JsonProperty("rtUrl")
    public void setRtURL(Object value) { this.rtURL = value; }

    @JsonProperty("ftype")
    public Long getFtype() { return ftype; }
    @JsonProperty("ftype")
    public void setFtype(Long value) { this.ftype = value; }

    @JsonProperty("rtUrls")
    public List<Object> getRtUrls() { return rtUrls; }
    @JsonProperty("rtUrls")
    public void setRtUrls(List<Object> value) { this.rtUrls = value; }

    @JsonProperty("djId")
    public Long getDjID() { return djID; }
    @JsonProperty("djId")
    public void setDjID(Long value) { this.djID = value; }

    @JsonProperty("copyright")
    public Long getCopyright() { return copyright; }
    @JsonProperty("copyright")
    public void setCopyright(Long value) { this.copyright = value; }

    @JsonProperty("s_id")
    public Long getSID() { return sID; }
    @JsonProperty("s_id")
    public void setSID(Long value) { this.sID = value; }

    @JsonProperty("mark")
    public Double getMark() { return mark; }
    @JsonProperty("mark")
    public void setMark(Double value) { this.mark = value; }

    @JsonProperty("originCoverType")
    public Long getOriginCoverType() { return originCoverType; }
    @JsonProperty("originCoverType")
    public void setOriginCoverType(Long value) { this.originCoverType = value; }

    @JsonProperty("noCopyrightRcmd")
    public NoCopyrightRcmd getNoCopyrightRcmd() { return noCopyrightRcmd; }
    @JsonProperty("noCopyrightRcmd")
    public void setNoCopyrightRcmd(NoCopyrightRcmd value) { this.noCopyrightRcmd = value; }

    @JsonProperty("rtype")
    public Long getRtype() { return rtype; }
    @JsonProperty("rtype")
    public void setRtype(Long value) { this.rtype = value; }

    @JsonProperty("rurl")
    public Object getRurl() { return rurl; }
    @JsonProperty("rurl")
    public void setRurl(Object value) { this.rurl = value; }

    @JsonProperty("mst")
    public Long getMst() { return mst; }
    @JsonProperty("mst")
    public void setMst(Long value) { this.mst = value; }

    @JsonProperty("cp")
    public Long getCp() { return cp; }
    @JsonProperty("cp")
    public void setCp(Long value) { this.cp = value; }

    @JsonProperty("mv")
    public Long getMv() { return mv; }
    @JsonProperty("mv")
    public void setMv(Long value) { this.mv = value; }

    @JsonProperty("publishTime")
    public Long getPublishTime() { return publishTime; }
    @JsonProperty("publishTime")
    public void setPublishTime(Long value) { this.publishTime = value; }

    @JsonProperty("tns")
    public List<String> getTns() { return tns; }
    @JsonProperty("tns")
    public void setTns(List<String> value) { this.tns = value; }
}
