package com.errorhandling.errorhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.errorhandling.errorhandling.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}
