package com.errorhandling.errorhandling.service.Impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.errorhandling.errorhandling.entity.Post;
import com.errorhandling.errorhandling.exception.BlogAPIException;
import com.errorhandling.errorhandling.repository.PostRepository;
import com.errorhandling.errorhandling.service.PostService;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;


    @Override
    public Post createPost(Post post) {
        // TODO Auto-generated method stub
        return postRepository.save(post);
    }

    
    @Override
    public List<Post> getAllPost() {

        return postRepository.findAll();
    }



    @Override
    public Post getPostById(Long postId) {
        // TODO Auto-generated method stub
        return postRepository.findById(postId).orElseThrow(()-> new BlogAPIException(HttpStatus.BAD_REQUEST, "Blog is not available"));
    }



    @Override
    public Post updatePost(Long blogId, Post post) {
        // TODO Auto-generated method stub
        Post postGet = postRepository.findById(blogId).get();

        if( Objects.nonNull( post.getTitle() ) && !"".equalsIgnoreCase( postGet.getTitle() ))
        {
            postGet.setTitle(post.getTitle());
        }

        if( Objects.nonNull( post.getDescription() ) && !"".equalsIgnoreCase(postGet.getDescription()))
        {
            postGet.setDescription(post.getDescription());
        } 

        if( Objects.nonNull( post.getDescription() ) && !"".equalsIgnoreCase(postGet.getContent()))
        {
            postGet.setDescription(post.getDescription());
        } 
        return postRepository.save(postGet);
    }



    @Override
    public String deletePost(Long postId) {
        // TODO Auto-generated method stub
        postRepository.deleteById(postId);
        return "Post Deleted Successfully";
    }
    
}
