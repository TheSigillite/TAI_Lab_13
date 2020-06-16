package com.example.TAI.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @CrossOrigin
    @GetMapping(path = "/api/posts")
    public List<Post> getAllPosts(){
        return postService.getAll();
    }

    @CrossOrigin
    @GetMapping(path = "/api/posts/{id}")
    public Post get(@PathVariable int id){
        return postService.get(id);
    }
}
