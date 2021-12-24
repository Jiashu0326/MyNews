package com.laioffer.tinnews.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Article {
    public String author;
    public String content;
    public String description;
    public String publishedAt;
    public String title;

    @NonNull
    @PrimaryKey
    public String url;
    public String urlToImage;
}
