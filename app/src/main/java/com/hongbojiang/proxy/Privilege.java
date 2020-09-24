package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;

public class Privilege {
    private Long id;
    private Long fee;
    private Long payed;
    private Long st;
    private Long pl;
    private Long dl;
    private Long sp;
    private Long cp;
    private Long subp;
    private Boolean cs;
    private Long maxbr;
    private Long fl;
    private Boolean toast;
    private Long flag;
    private Boolean preSell;
    private Long playMaxbr;
    private Long downloadMaxbr;

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("fee")
    public Long getFee() { return fee; }
    @JsonProperty("fee")
    public void setFee(Long value) { this.fee = value; }

    @JsonProperty("payed")
    public Long getPayed() { return payed; }
    @JsonProperty("payed")
    public void setPayed(Long value) { this.payed = value; }

    @JsonProperty("st")
    public Long getSt() { return st; }
    @JsonProperty("st")
    public void setSt(Long value) { this.st = value; }

    @JsonProperty("pl")
    public Long getPl() { return pl; }
    @JsonProperty("pl")
    public void setPl(Long value) { this.pl = value; }

    @JsonProperty("dl")
    public Long getDL() { return dl; }
    @JsonProperty("dl")
    public void setDL(Long value) { this.dl = value; }

    @JsonProperty("sp")
    public Long getSP() { return sp; }
    @JsonProperty("sp")
    public void setSP(Long value) { this.sp = value; }

    @JsonProperty("cp")
    public Long getCp() { return cp; }
    @JsonProperty("cp")
    public void setCp(Long value) { this.cp = value; }

    @JsonProperty("subp")
    public Long getSubp() { return subp; }
    @JsonProperty("subp")
    public void setSubp(Long value) { this.subp = value; }

    @JsonProperty("cs")
    public Boolean getCS() { return cs; }
    @JsonProperty("cs")
    public void setCS(Boolean value) { this.cs = value; }

    @JsonProperty("maxbr")
    public Long getMaxbr() { return maxbr; }
    @JsonProperty("maxbr")
    public void setMaxbr(Long value) { this.maxbr = value; }

    @JsonProperty("fl")
    public Long getFL() { return fl; }
    @JsonProperty("fl")
    public void setFL(Long value) { this.fl = value; }

    @JsonProperty("toast")
    public Boolean getToast() { return toast; }
    @JsonProperty("toast")
    public void setToast(Boolean value) { this.toast = value; }

    @JsonProperty("flag")
    public Long getFlag() { return flag; }
    @JsonProperty("flag")
    public void setFlag(Long value) { this.flag = value; }

    @JsonProperty("preSell")
    public Boolean getPreSell() { return preSell; }
    @JsonProperty("preSell")
    public void setPreSell(Boolean value) { this.preSell = value; }

    @JsonProperty("playMaxbr")
    public Long getPlayMaxbr() { return playMaxbr; }
    @JsonProperty("playMaxbr")
    public void setPlayMaxbr(Long value) { this.playMaxbr = value; }

    @JsonProperty("downloadMaxbr")
    public Long getDownloadMaxbr() { return downloadMaxbr; }
    @JsonProperty("downloadMaxbr")
    public void setDownloadMaxbr(Long value) { this.downloadMaxbr = value; }
}
