package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;

public class Creator {
    private Boolean defaultAvatar;
    private Long province;
    private Long authStatus;
    private Boolean followed;
    private String avatarURL;
    private Long accountStatus;
    private Long gender;
    private Long city;
    private Long birthday;
    private Long userID;
    private Long userType;
    private String nickname;
    private String signature;
    private String description;
    private String detailDescription;
    private Double avatarImgID;
    private Double backgroundImgID;
    private String backgroundURL;
    private Long authority;
    private Boolean mutual;
    private Object expertTags;
    private Object experts;
    private Long djStatus;
    private Long vipType;
    private Object remarkName;
    private String avatarImgIDStr;
    private String backgroundImgIDStr;
    private String creatorAvatarImgIDStr;

    @JsonProperty("defaultAvatar")
    public Boolean getDefaultAvatar() { return defaultAvatar; }
    @JsonProperty("defaultAvatar")
    public void setDefaultAvatar(Boolean value) { this.defaultAvatar = value; }

    @JsonProperty("province")
    public Long getProvince() { return province; }
    @JsonProperty("province")
    public void setProvince(Long value) { this.province = value; }

    @JsonProperty("authStatus")
    public Long getAuthStatus() { return authStatus; }
    @JsonProperty("authStatus")
    public void setAuthStatus(Long value) { this.authStatus = value; }

    @JsonProperty("followed")
    public Boolean getFollowed() { return followed; }
    @JsonProperty("followed")
    public void setFollowed(Boolean value) { this.followed = value; }

    @JsonProperty("avatarUrl")
    public String getAvatarURL() { return avatarURL; }
    @JsonProperty("avatarUrl")
    public void setAvatarURL(String value) { this.avatarURL = value; }

    @JsonProperty("accountStatus")
    public Long getAccountStatus() { return accountStatus; }
    @JsonProperty("accountStatus")
    public void setAccountStatus(Long value) { this.accountStatus = value; }

    @JsonProperty("gender")
    public Long getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(Long value) { this.gender = value; }

    @JsonProperty("city")
    public Long getCity() { return city; }
    @JsonProperty("city")
    public void setCity(Long value) { this.city = value; }

    @JsonProperty("birthday")
    public Long getBirthday() { return birthday; }
    @JsonProperty("birthday")
    public void setBirthday(Long value) { this.birthday = value; }

    @JsonProperty("userId")
    public Long getUserID() { return userID; }
    @JsonProperty("userId")
    public void setUserID(Long value) { this.userID = value; }

    @JsonProperty("userType")
    public Long getUserType() { return userType; }
    @JsonProperty("userType")
    public void setUserType(Long value) { this.userType = value; }

    @JsonProperty("nickname")
    public String getNickname() { return nickname; }
    @JsonProperty("nickname")
    public void setNickname(String value) { this.nickname = value; }

    @JsonProperty("signature")
    public String getSignature() { return signature; }
    @JsonProperty("signature")
    public void setSignature(String value) { this.signature = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("detailDescription")
    public String getDetailDescription() { return detailDescription; }
    @JsonProperty("detailDescription")
    public void setDetailDescription(String value) { this.detailDescription = value; }

    @JsonProperty("avatarImgId")
    public Double getAvatarImgID() { return avatarImgID; }
    @JsonProperty("avatarImgId")
    public void setAvatarImgID(Double value) { this.avatarImgID = value; }

    @JsonProperty("backgroundImgId")
    public Double getBackgroundImgID() { return backgroundImgID; }
    @JsonProperty("backgroundImgId")
    public void setBackgroundImgID(Double value) { this.backgroundImgID = value; }

    @JsonProperty("backgroundUrl")
    public String getBackgroundURL() { return backgroundURL; }
    @JsonProperty("backgroundUrl")
    public void setBackgroundURL(String value) { this.backgroundURL = value; }

    @JsonProperty("authority")
    public Long getAuthority() { return authority; }
    @JsonProperty("authority")
    public void setAuthority(Long value) { this.authority = value; }

    @JsonProperty("mutual")
    public Boolean getMutual() { return mutual; }
    @JsonProperty("mutual")
    public void setMutual(Boolean value) { this.mutual = value; }

    @JsonProperty("expertTags")
    public Object getExpertTags() { return expertTags; }
    @JsonProperty("expertTags")
    public void setExpertTags(Object value) { this.expertTags = value; }

    @JsonProperty("experts")
    public Object getExperts() { return experts; }
    @JsonProperty("experts")
    public void setExperts(Object value) { this.experts = value; }

    @JsonProperty("djStatus")
    public Long getDjStatus() { return djStatus; }
    @JsonProperty("djStatus")
    public void setDjStatus(Long value) { this.djStatus = value; }

    @JsonProperty("vipType")
    public Long getVipType() { return vipType; }
    @JsonProperty("vipType")
    public void setVipType(Long value) { this.vipType = value; }

    @JsonProperty("remarkName")
    public Object getRemarkName() { return remarkName; }
    @JsonProperty("remarkName")
    public void setRemarkName(Object value) { this.remarkName = value; }

    @JsonProperty("avatarImgIdStr")
    public String getAvatarImgIDStr() { return avatarImgIDStr; }
    @JsonProperty("avatarImgIdStr")
    public void setAvatarImgIDStr(String value) { this.avatarImgIDStr = value; }

    @JsonProperty("backgroundImgIdStr")
    public String getBackgroundImgIDStr() { return backgroundImgIDStr; }
    @JsonProperty("backgroundImgIdStr")
    public void setBackgroundImgIDStr(String value) { this.backgroundImgIDStr = value; }

    @JsonProperty("avatarImgId_str")
    public String getCreatorAvatarImgIDStr() { return creatorAvatarImgIDStr; }
    @JsonProperty("avatarImgId_str")
    public void setCreatorAvatarImgIDStr(String value) { this.creatorAvatarImgIDStr = value; }
}
