package com.example.chineduoty.aroundme.data.models;

/**
 * Created by chineduoty on 26/11/2017.
 */

public class Event {
    private String imgUrl;
    private String title;
    private String address;
    private String eventDate;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public Event(String imgUrl,String title,String address,String eventDate){
        this.imgUrl = imgUrl;
        this.title = title;
        this.address = address;
        this.eventDate = eventDate;
    }
}
