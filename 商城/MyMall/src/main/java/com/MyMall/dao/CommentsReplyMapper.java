package com.MyMall.dao;

import com.MyMall.pojo.CommentsReply;

public interface CommentsReplyMapper {
    int insert(CommentsReply record);

    int insertSelective(CommentsReply record);
}