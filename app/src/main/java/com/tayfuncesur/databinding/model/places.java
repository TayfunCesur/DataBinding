package com.tayfuncesur.databinding.model;

/**
 * Created by TayfunCesur on 23/04/17.
 */

public class places{


    private String name;
    private String counrty;
    private String photo_url;
    private int position;

    public places(String name, String counrty, String photo_url) {
        this.name = name;
        this.counrty = counrty;
        this.photo_url = photo_url;

    }


    public String getName(){
        return name;
    }

    public String getPhoto_url(){
        return photo_url;
    }

    public String getCounrty(){
        return counrty;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int pos){
        this.position = pos;
    }
}
