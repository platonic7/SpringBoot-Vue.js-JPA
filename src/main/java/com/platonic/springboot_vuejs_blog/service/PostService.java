package com.platonic.springboot_vuejs_blog.service;

import com.platonic.springboot_vuejs_blog.entities.Post;
import com.platonic.springboot_vuejs_blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}