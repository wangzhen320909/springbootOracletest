package com.wzg.orcltest.demo.service;


import com.wzg.orcltest.demo.entity.User;

public interface UserService {

    public User findByName(String name);
}
