package com.example.mall.bean;

import java.util.List;

public class ProductOrder {
    private String sid;
    private String dateString;
    private List<Product> plist;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public List<Product> getPlist() {
        return plist;
    }

    public void setPlist(List<Product> plist) {
        this.plist = plist;
    }
}
