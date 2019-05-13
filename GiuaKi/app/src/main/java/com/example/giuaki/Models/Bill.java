package com.example.giuaki.Models;

import java.util.Date;

public class Bill {
    String MADDH;
    String date;
    boolean checkRemove=false;
    boolean checkOn=false;

    public boolean isCheckRemove() {
        return checkRemove;
    }

    public void setCheckRemove(boolean checkRemove) {
        this.checkRemove = checkRemove;
    }

    public boolean isCheckOn() {
        return checkOn;
    }

    public void setCheckOn(boolean checkOn) {
        this.checkOn = checkOn;
    }

    public Bill(String MADDH, String date) {
        this.MADDH = MADDH;
        this.date = date;
    }

    public String getMADDH() {
        return MADDH;
    }

    public void setMADDH(String MADDH) {
        this.MADDH = MADDH;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
