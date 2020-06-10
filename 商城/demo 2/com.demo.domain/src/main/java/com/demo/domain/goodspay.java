package com.demo.domain;

import java.util.List;

public class goodspay {
    private String sid;
    private String dateString;
    private List<goods> glist;

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

    public List<goods> getGlist() {
        return glist;
    }

    public void setGlist(List<goods> glist) {
        this.glist = glist;
    }
}
