package com.thor.socialmedia.Jpa;

import com.thor.socialmedia.User.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
