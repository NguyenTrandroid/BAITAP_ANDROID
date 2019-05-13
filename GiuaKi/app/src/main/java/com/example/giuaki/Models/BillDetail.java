package com.example.giuaki.Models;

public class BillDetail {
    String mADDH;
    String maXe;
    String soLuong;
    String tenXe;

    public BillDetail(String mADDH, String maXe, String soLuong, String tenXe) {
        this.mADDH = mADDH;
        this.maXe = maXe;
        this.soLuong = soLuong;
        this.tenXe = tenXe;
    }

    public String getmADDH() {
        return mADDH;
    }

    public void setmADDH(String mADDH) {
        this.mADDH = mADDH;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }
}
