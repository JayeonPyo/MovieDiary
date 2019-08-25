package com.example.internet.bookmark;

public class BookMark {


    private  String title;
    private  String url;

    public BookMark(String url) {
        this.title = url.length() > 12 ? url.substring(0,12) + "...." : url;
        this.url = url;

    }



    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public  boolean equals(Object object){
        return  object instanceof BookMark && url.equals(((BookMark) object).getUrl());
    }
}
