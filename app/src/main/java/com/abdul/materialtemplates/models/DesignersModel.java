package com.abdul.materialtemplates.models;

public class DesignersModel {
    private String name;
    private int id;
    private int profile_pic;
    private String place;
    
    public DesignersModel(String name, int id, int profile_pic, String place) {
        this.name = name;
        this.id = id;
        this.profile_pic = profile_pic;
        this.place = place;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getProfile_pic() {
        return profile_pic;
    }
    
    public void setProfile_pic(int profile_pic) {
        this.profile_pic = profile_pic;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPlace() {
        return place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }
}
