package com.wzg.orcltest.demo.service.impl;


import com.wzg.orcltest.demo.dao.UserDao;
import com.wzg.orcltest.demo.entity.User;
import com.wzg.orcltest.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
