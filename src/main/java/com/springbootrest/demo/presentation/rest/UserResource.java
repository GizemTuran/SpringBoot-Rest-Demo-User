package com.springbootrest.demo.presentation.rest;

import com.springbootrest.demo.business.service.UserService;
import com.springbootrest.demo.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("api/find/{userid}")
    public User findById(@PathVariable("userid")long userId){

        return userService.findById(userId);
    }
    @GetMapping("api/find/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("api/user/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
