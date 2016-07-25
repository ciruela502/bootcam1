package com.marta.bootcamp1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by marta on 25.07.2016.
 * tu beda skladowane rzeczy pobrane
 */
public class Day {
    @SerializedName("app")
    public String app;
    @SerializedName("name")
    public String name;
    @SerializedName("plan")
    public String plan;
    @SerializedName("topic")
    public String topic;

    Day(String app,String name,String plan,String topic){
        this.app = app;
        this.name = name;
        this.plan = plan;
        this.topic = topic;
    }

}
