package com.waa.lab3.service;

import com.waa.lab3.domain.Post;
import com.waa.lab3.domain.User;

import java.util.List;

public interface IPostService {
    List<Post> findPostsByTitle(String title);

    List<User> getUsersWithPostTitle(String title);
}
