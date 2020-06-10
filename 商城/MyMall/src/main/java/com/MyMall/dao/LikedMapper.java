package com.MyMall.dao;

import com.MyMall.pojo.Liked;

public interface LikedMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Liked record);

    int insertSelective(Liked record);

    Liked selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Liked record);

    int updateByPrimaryKey(Liked record);
}