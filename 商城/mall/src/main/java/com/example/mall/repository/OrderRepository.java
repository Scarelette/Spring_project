package com.example.mall.repository;

import com.example.mall.bean.Order;
import com.example.mall.bean.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Select("select * from product where product_id=#{goodsid}")
    List<Product> findProductsById(String goodsid) throws Exception;
//    @Insert("insert into pay(sid,dateString,goodsid) values(#{sid},#{dateString},#{goodsid})")
//    public Object save(Order order);
}
