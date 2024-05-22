package com.example.spring.mapper;

import com.example.spring.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface UserMapper {
    List<User> findAll();



    User selectId(Integer id);

    Integer adduser(User user);

    Integer updateUser(User user);

    List<User> selectById(Integer tid);
}