package com.example.playingcard;

public class Card {
    int iD;
    int point;

    public Card(int iD, int point) {
        this.iD = iD;
        this.point = point;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
