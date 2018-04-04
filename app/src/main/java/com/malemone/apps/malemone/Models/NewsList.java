package com.malemone.apps.malemone.Models;

/**
 * Created by mcsbusing on 2018/03/17.
 */

public class NewsList {

    String articalHeading, articleSummary;
    int articalPicture;

    public NewsList(String articalHeading, String articleSummary, int articalPicture) {
        this.articalHeading = articalHeading;
        this.articleSummary = articleSummary;
        this.articalPicture = articalPicture;
    }

    public String getArticalHeading() {
        return articalHeading;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public int getArticalPicture() {
        return articalPicture;
    }
}
