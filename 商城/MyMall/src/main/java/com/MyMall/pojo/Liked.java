package com.MyMall.pojo;

public class Liked {
    private Long id;

    private String objId;

    private String userId;

    private Integer likeStatus;

    public Liked(Long id, String objId, String userId, Integer likeStatus) {
        this.id = id;
        this.objId = objId;
        this.userId = userId;
        this.likeStatus = likeStatus;
    }

    public Liked() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getLikeStatus() {
        return likeStatus;
    }

    public void setLikeStatus(Integer likeStatus) {
        this.likeStatus = likeStatus;
    }
}