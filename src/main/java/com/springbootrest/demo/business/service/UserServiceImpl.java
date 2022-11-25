package com.springbootrest.demo.business.service;

import com.springbootrest.demo.data.entity.User;
import com.springbootrest.demo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findById(long userId) {
        User user = userRepository.findUserById(userId);
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> list=userRepository.findAll();
        return list;
    }

    @Override
    public String addUser(User user) {
        String email = userRepository.findByEmail(user.getEmail());
        userRepository.save(user);
            return "User added successfully.";
    }
}
