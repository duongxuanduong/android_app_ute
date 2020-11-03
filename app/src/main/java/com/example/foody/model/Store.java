package com.example.foody.model;

public class Store {
    private String name;
    private int thumbnail;
    private  String address;


    public Store() {
    }
    public Store(String name, int thumbnail, String address) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
