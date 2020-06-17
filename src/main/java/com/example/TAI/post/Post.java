package com.example.TAI.post;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue
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
