package com.example.TAI.post;

import lombok.Data;

@Data
public class Post {
    private long id;
    private String title;
    private String url;
    private String content;

    public Post(long id, String title, String url, String content) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.content = content;
    }
}
