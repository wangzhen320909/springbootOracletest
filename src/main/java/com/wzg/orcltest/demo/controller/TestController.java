package com.wzg.orcltest.demo.controller;


import com.wzg.orcltest.demo.entity.User;
import com.wzg.orcltest.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String get(){
        User user = userService.findByName("1");

        return user.toString();

    }
}
