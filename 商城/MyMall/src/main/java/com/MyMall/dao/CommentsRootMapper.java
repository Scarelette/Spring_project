package com.MyMall.dao;

import com.MyMall.pojo.CommentsRoot;

public interface CommentsRootMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentsRoot record);

    int insertSelective(CommentsRoot record);

    CommentsRoot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommentsRoot record);

    int updateByPrimaryKey(CommentsRoot record);
}