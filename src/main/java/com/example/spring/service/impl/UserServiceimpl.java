package com.example.spring.service.impl;

import com.example.spring.domain.User;
import com.example.spring.mapper.UserMapper;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectId(Integer id) {
        return userMapper.selectId(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public Integer adduser(User user) {
        return userMapper.adduser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> selectById(Integer tid) {
        return  userMapper.selectById(tid);
    }
}