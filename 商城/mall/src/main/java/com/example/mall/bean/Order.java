package com.example.mall.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String productsId;
    private String orderId;
    private String price;
    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
