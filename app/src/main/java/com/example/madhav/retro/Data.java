package com.example.madhav.retro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private String id;


    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("profile_pic_path")
    @Expose
    private String profile_pic;

    @SerializedName("about_my_talent")
    @Expose
    private String talent;

    @SerializedName("user_fans")
    @Expose
    private String user_fans;

    @SerializedName("category")
    @Expose
    private String category;

    @SerializedName("fan_status")
    @Expose
    private String fan_status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getUser_fans() {
        return user_fans;
    }

    public void setUser_fans(String user_fans) {
        this.user_fans = user_fans;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFan_status() {
        return fan_status;
    }

    public void setFan_status(String fan_status) {
        this.fan_status = fan_status;
    }
}
