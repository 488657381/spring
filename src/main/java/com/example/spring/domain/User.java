package com.example.spring.domain;

import java.io.Serializable;

public class User  {
    private Long id;//编号

    private Long classroom;//班级

    private String sex;//性别
    private String username;//用户名
    private String password;//密码

    private String skill;
    //省略get set方法


    public Long getClassroom() {
        return classroom;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", classroom=" + classroom +
                ", sex='" + sex + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }

    public void setClassroom(Long classroom) {
        this.classroom = classroom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}