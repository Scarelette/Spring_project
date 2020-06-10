package com.demo.dao;

import com.demo.domain.goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface goodsdao {
    //商品信息
    @Select("select * from goods")
    public List<goods> findAll() throws Exception;
}
