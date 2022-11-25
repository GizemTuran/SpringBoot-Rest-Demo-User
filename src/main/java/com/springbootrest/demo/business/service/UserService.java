package com.springbootrest.demo.business.service;

import com.springbootrest.demo.data.entity.User;

import java.util.List;

public interface UserService {
    User findById(long userId);
    List<User> findAll();
    String addUser(User user);
}
