package com.errorhandling.errorhandling.service;

import java.util.List;

import com.errorhandling.errorhandling.entity.Post;

public interface PostService {

    Post createPost(Post post);

    List<Post> getAllPost();

    Post getPostById(Long postId);

    Post updatePost(Long blogId, Post post);

    String deletePost(Long postId);
    
}
