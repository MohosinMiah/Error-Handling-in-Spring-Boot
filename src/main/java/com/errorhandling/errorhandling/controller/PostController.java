package com.errorhandling.errorhandling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.errorhandling.errorhandling.entity.Post;
import com.errorhandling.errorhandling.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping()
    public Post createPost( @Validated @RequestBody Post post)
    {
        return postService.createPost(post);
    }

    @GetMapping()
    public List<Post> getAllPost()
    {
        return postService.getAllPost();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") Long postId)  
    
    {
        return postService.getPostById(postId);
    }

    @PutMapping("/{id}")
    public Post updatePostById(@PathVariable("id") Long postId, @RequestBody Post post )
    {
        return postService.updatePost(postId, post);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable("id") Long postId )
    {
        return postService.deletePost(postId);
    }

}
