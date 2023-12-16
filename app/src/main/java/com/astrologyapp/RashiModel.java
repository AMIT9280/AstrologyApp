package com.astrologyapp;

public class RashiModel {
    String rashi;
    int imgList;
    public RashiModel(String rashi, int imgList) {
            this.rashi = rashi;
            this.imgList = imgList;
    }

    public String getRashi() {
        return rashi;
    }

    public void setRashi(String rashi) {
        this.rashi = rashi;
    }

    public int getImgList() {
        return imgList;
    }

    public void setImgList(int imgList) {
        this.imgList = imgList;
    }
}
