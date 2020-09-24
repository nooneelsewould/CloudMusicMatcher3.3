package com.hongbojiang.proxy;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Playlist {
    private List<Creator> subscribers;
    private Boolean subscribed;
    private Creator creator;
    private List<Track> tracks;
    private List<TrackID> trackIDS;
    private Object updateFrequency;
    private Long backgroundCoverID;
    private Object backgroundCoverURL;
    private Long titleImage;
    private Object titleImageURL;
    private Object englishTitle;
    private Boolean opRecommend;
    private Long subscribedCount;
    private Long cloudTrackCount;
    private Object description;
    private Boolean ordered;
    private Long status;
    private Long createTime;
    private Boolean highQuality;
    private Long userID;
    private Double coverImgID;
    private Boolean newImported;
    private Long updateTime;
    private Long specialType;
    private String commentThreadID;
    private Long privacy;
    private Long trackUpdateTime;
    private Long trackCount;
    private String coverImgURL;
    private Long playCount;
    private Long trackNumberUpdateTime;
    private List<Object> tags;
    private Long adType;
    private String name;
    private Long id;
    private Long shareCount;
    private String coverImgIDStr;
    private Long commentCount;

    @JsonProperty("subscribers")
    public List<Creator> getSubscribers() { return subscribers; }
    @JsonProperty("subscribers")
    public void setSubscribers(List<Creator> value) { this.subscribers = value; }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() { return subscribed; }
    @JsonProperty("subscribed")
    public void setSubscribed(Boolean value) { this.subscribed = value; }

    @JsonProperty("creator")
    public Creator getCreator() { return creator; }
    @JsonProperty("creator")
    public void setCreator(Creator value) { this.creator = value; }

    @JsonProperty("tracks")
    public List<Track> getTracks() { return tracks; }
    @JsonProperty("tracks")
    public void setTracks(List<Track> value) { this.tracks = value; }

    @JsonProperty("trackIds")
    public List<TrackID> getTrackIDS() { return trackIDS; }
    @JsonProperty("trackIds")
    public void setTrackIDS(List<TrackID> value) { this.trackIDS = value; }

    @JsonProperty("updateFrequency")
    public Object getUpdateFrequency() { return updateFrequency; }
    @JsonProperty("updateFrequency")
    public void setUpdateFrequency(Object value) { this.updateFrequency = value; }

    @JsonProperty("backgroundCoverId")
    public Long getBackgroundCoverID() { return backgroundCoverID; }
    @JsonProperty("backgroundCoverId")
    public void setBackgroundCoverID(Long value) { this.backgroundCoverID = value; }

    @JsonProperty("backgroundCoverUrl")
    public Object getBackgroundCoverURL() { return backgroundCoverURL; }
    @JsonProperty("backgroundCoverUrl")
    public void setBackgroundCoverURL(Object value) { this.backgroundCoverURL = value; }

    @JsonProperty("titleImage")
    public Long getTitleImage() { return titleImage; }
    @JsonProperty("titleImage")
    public void setTitleImage(Long value) { this.titleImage = value; }

    @JsonProperty("titleImageUrl")
    public Object getTitleImageURL() { return titleImageURL; }
    @JsonProperty("titleImageUrl")
    public void setTitleImageURL(Object value) { this.titleImageURL = value; }

    @JsonProperty("englishTitle")
    public Object getEnglishTitle() { return englishTitle; }
    @JsonProperty("englishTitle")
    public void setEnglishTitle(Object value) { this.englishTitle = value; }

    @JsonProperty("opRecommend")
    public Boolean getOpRecommend() { return opRecommend; }
    @JsonProperty("opRecommend")
    public void setOpRecommend(Boolean value) { this.opRecommend = value; }

    @JsonProperty("subscribedCount")
    public Long getSubscribedCount() { return subscribedCount; }
    @JsonProperty("subscribedCount")
    public void setSubscribedCount(Long value) { this.subscribedCount = value; }

    @JsonProperty("cloudTrackCount")
    public Long getCloudTrackCount() { return cloudTrackCount; }
    @JsonProperty("cloudTrackCount")
    public void setCloudTrackCount(Long value) { this.cloudTrackCount = value; }

    @JsonProperty("description")
    public Object getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Object value) { this.description = value; }

    @JsonProperty("ordered")
    public Boolean getOrdered() { return ordered; }
    @JsonProperty("ordered")
    public void setOrdered(Boolean value) { this.ordered = value; }

    @JsonProperty("status")
    public Long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Long value) { this.status = value; }

    @JsonProperty("createTime")
    public Long getCreateTime() { return createTime; }
    @JsonProperty("createTime")
    public void setCreateTime(Long value) { this.createTime = value; }

    @JsonProperty("highQuality")
    public Boolean getHighQuality() { return highQuality; }
    @JsonProperty("highQuality")
    public void setHighQuality(Boolean value) { this.highQuality = value; }

    @JsonProperty("userId")
    public Long getUserID() { return userID; }
    @JsonProperty("userId")
    public void setUserID(Long value) { this.userID = value; }

    @JsonProperty("coverImgId")
    public Double getCoverImgID() { return coverImgID; }
    @JsonProperty("coverImgId")
    public void setCoverImgID(Double value) { this.coverImgID = value; }

    @JsonProperty("newImported")
    public Boolean getNewImported() { return newImported; }
    @JsonProperty("newImported")
    public void setNewImported(Boolean value) { this.newImported = value; }

    @JsonProperty("updateTime")
    public Long getUpdateTime() { return updateTime; }
    @JsonProperty("updateTime")
    public void setUpdateTime(Long value) { this.updateTime = value; }

    @JsonProperty("specialType")
    public Long getSpecialType() { return specialType; }
    @JsonProperty("specialType")
    public void setSpecialType(Long value) { this.specialType = value; }

    @JsonProperty("commentThreadId")
    public String getCommentThreadID() { return commentThreadID; }
    @JsonProperty("commentThreadId")
    public void setCommentThreadID(String value) { this.commentThreadID = value; }

    @JsonProperty("privacy")
    public Long getPrivacy() { return privacy; }
    @JsonProperty("privacy")
    public void setPrivacy(Long value) { this.privacy = value; }

    @JsonProperty("trackUpdateTime")
    public Long getTrackUpdateTime() { return trackUpdateTime; }
    @JsonProperty("trackUpdateTime")
    public void setTrackUpdateTime(Long value) { this.trackUpdateTime = value; }

    @JsonProperty("trackCount")
    public Long getTrackCount() { return trackCount; }
    @JsonProperty("trackCount")
    public void setTrackCount(Long value) { this.trackCount = value; }

    @JsonProperty("coverImgUrl")
    public String getCoverImgURL() { return coverImgURL; }
    @JsonProperty("coverImgUrl")
    public void setCoverImgURL(String value) { this.coverImgURL = value; }

    @JsonProperty("playCount")
    public Long getPlayCount() { return playCount; }
    @JsonProperty("playCount")
    public void setPlayCount(Long value) { this.playCount = value; }

    @JsonProperty("trackNumberUpdateTime")
    public Long getTrackNumberUpdateTime() { return trackNumberUpdateTime; }
    @JsonProperty("trackNumberUpdateTime")
    public void setTrackNumberUpdateTime(Long value) { this.trackNumberUpdateTime = value; }

    @JsonProperty("tags")
    public List<Object> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Object> value) { this.tags = value; }

    @JsonProperty("adType")
    public Long getAdType() { return adType; }
    @JsonProperty("adType")
    public void setAdType(Long value) { this.adType = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("shareCount")
    public Long getShareCount() { return shareCount; }
    @JsonProperty("shareCount")
    public void setShareCount(Long value) { this.shareCount = value; }

    @JsonProperty("coverImgId_str")
    public String getCoverImgIDStr() { return coverImgIDStr; }
    @JsonProperty("coverImgId_str")
    public void setCoverImgIDStr(String value) { this.coverImgIDStr = value; }

    @JsonProperty("commentCount")
    public Long getCommentCount() { return commentCount; }
    @JsonProperty("commentCount")
    public void setCommentCount(Long value) { this.commentCount = value; }
}
