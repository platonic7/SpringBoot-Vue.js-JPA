package com.platonic.springboot_vuejs_blog.repositories;

import com.platonic.springboot_vuejs_blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
