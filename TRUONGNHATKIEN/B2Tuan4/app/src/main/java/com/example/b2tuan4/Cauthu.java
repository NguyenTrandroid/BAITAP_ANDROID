package com.example.b2tuan4;

public class Cauthu {
    int imgCauthu;
    String name;
    String birthday;
    int imgFflag;

    public Cauthu(int imgCauthu, String name, String birthday, int imgFflag) {
        this.imgCauthu = imgCauthu;
        this.name = name;
        this.birthday = birthday;
        this.imgFflag = imgFflag;
    }

    public int getImgCauthu() {
        return imgCauthu;
    }

    public void setImgCauthu(int imgCauthu) {
        this.imgCauthu = imgCauthu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getImgFflag() {
        return imgFflag;
    }

    public void setImgFflag(int imgFflag) {
        this.imgFflag = imgFflag;
    }
}
