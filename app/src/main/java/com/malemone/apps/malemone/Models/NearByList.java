package com.malemone.apps.malemone.Models;

/**
 * Created by mcsbusing on 2018/03/18.
 */

public class NearByList {

    String articalTitle, subTitle, description;
    int img;

    public NearByList(int img, String title, String subTitle, String description) {
        this.img = img;
        this.articalTitle = title;
        this.subTitle = subTitle;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public String getArticalTitle() {
        return articalTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDescription() {
        return description;
    }
}
