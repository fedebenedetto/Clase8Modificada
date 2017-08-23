package com.androidizate.clase8.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aye_2 on 31/8/2017.
 */

public class Book {

    @SerializedName("ID")
    private Integer iD;
    @SerializedName("Title")
    private String title;
    @SerializedName("Description")
    private String description;
    @SerializedName("PageCount")
    private Integer pageCount;
    @SerializedName("Excerpt")
    private String excerpt;
    @SerializedName("PublishDate")

    private String publishDate;

    public Book(Integer iD, String title, String description, Integer pageCount, String excerpt, String publishDate) {
        this.iD = iD;
        this.title = title;
        this.description = description;
        this.pageCount = pageCount;
        this.excerpt = excerpt;
        this.publishDate = publishDate;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

}
