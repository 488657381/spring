package com.example.spring.service;

import com.example.spring.domain.User;

import java.util.List;

public interface UserService {


    User selectId(Integer id);

    List<User> findAll();


    Integer adduser(User user);

    Integer updateUser(User user);

    List<User> selectById(Integer tid);
}