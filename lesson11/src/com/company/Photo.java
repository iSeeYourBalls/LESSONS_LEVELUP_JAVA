package com.company;

public class Photo {
    String title;
    String url;

    public Photo(String title) {
        this.title = title;
    }

    public Photo(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
