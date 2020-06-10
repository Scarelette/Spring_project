package com.demo.dao;

import com.demo.domain.goods;
import com.demo.domain.pay;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface paydao {
    @Select("select * from goods where goodsid=#{goodsid}")
    List<goods> findgoodsId(String goodsid) throws Exception;
    @Insert("insert into pay(sid,dateString,goodsid) values(#{sid},#{dateString},#{goodsid})")
    public void save(pay pays) throws Exception;

}
