package com.MyMall.pojo;

import java.util.Date;

public class CommentsReply {
    private Integer id;

    private String commentId;

    private String fromId;

    private String fromName;

    private String fromAvatar;

    private String toId;

    private String toName;

    private String toAvatar;

    private String content;

    private Date createTime;

    private Integer likeNum;

    public CommentsReply(Integer id, String commentId, String fromId, String fromName, String fromAvatar, String toId, String toName, String toAvatar, String content, Date createTime, Integer likeNum) {
        this.id = id;
        this.commentId = commentId;
        this.fromId = fromId;
        this.fromName = fromName;
        this.fromAvatar = fromAvatar;
        this.toId = toId;
        this.toName = toName;
        this.toAvatar = toAvatar;
        this.content = content;
        this.createTime = createTime;
        this.likeNum = likeNum;
    }

    public CommentsReply() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
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

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId == null ? null : toId.trim();
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    public String getToAvatar() {
        return toAvatar;
    }

    public void setToAvatar(String toAvatar) {
        this.toAvatar = toAvatar == null ? null : toAvatar.trim();
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

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }
}