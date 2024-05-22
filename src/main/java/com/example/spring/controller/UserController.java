package com.example.spring.controller;

import com.example.spring.domain.Result;
import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
        return userService.findAll();
    }
    @PostMapping("/{id}")
    public Result findId(@PathVariable("id") Integer id){
        User userObject=userService.selectId(id);
        System.out.println(userObject);
        return new Result("2022","获得id=="+id,userObject);
    }

    @PostMapping("/adduser")
    public Result adduser(@RequestBody User user){
        System.out.println(user);
        Integer flag = userService.adduser(user);
        if (flag != 0) {
            return new Result("200200", "添加成功", user.getId());
        } else {
            return new Result("400000", "添加失败", null);
        }
    }
    @PostMapping("/updateuser")
    public Result updateuser(@RequestBody User user){
        System.out.println(user);
        Integer flag = userService.updateUser(user);
        if (flag != 0) {
            return new Result("2024", "update成功", flag);
        } else {
            return new Result("400000", "update失败", null);
        }
    }
    @PostMapping("/username/{tid}")
    public Result selectById(@PathVariable("tid") Integer tid){
        List<User> userObject=userService.selectById(tid);
        System.out.println(userObject);
        return new Result("2022","教师id=="+tid,userObject);
    }
}