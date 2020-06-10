package com.MyMall.pojo;

import java.util.Date;

public class CommentsRoot {
    private Integer id;

    private Boolean type;

    private String ownerId;

    private String fromId;

    private String fromName;

    private String fromAvatar;

    private Integer likeNum;

    private String content;

    private Date createTime;

    private String commentId;

    public CommentsRoot(Integer id, Boolean type, String ownerId, String fromId, String fromName, String fromAvatar, Integer likeNum, String content, Date createTime, String commentId) {
        this.id = id;
        this.type = type;
        this.ownerId = ownerId;
        this.fromId = fromId;
        this.fromName = fromName;
        this.fromAvatar = fromAvatar;
        this.likeNum = likeNum;
        this.content = content;
        this.createTime = createTime;
        this.commentId = commentId;
    }

    public CommentsRoot() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName == null ? null : fromName.trim();
    }

    public String getFromAvatar() {
        return fromAvatar;
    }

    public void setFromAvatar(String fromAvatar) {
        this.fromAvatar = fromAvatar == null ? null : fromAvatar.trim();
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }
}