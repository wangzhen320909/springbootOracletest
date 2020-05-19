package com.wzg.orcltest.demo.dao;


import com.wzg.orcltest.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User findByName(String name);
}
