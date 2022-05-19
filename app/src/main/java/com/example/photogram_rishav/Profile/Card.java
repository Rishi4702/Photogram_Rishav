package com.example.photogram_rishav.Profile;


public class Card {
    private int imgurl;
    private String title;

    public Card(int imgurl,String title){
        this.title = title;
        this.imgurl = imgurl;
    }

    public int getImgurl() {
        return imgurl;
    }

    public void setImgurl(int imgurl) {
        this.imgurl = imgurl;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
