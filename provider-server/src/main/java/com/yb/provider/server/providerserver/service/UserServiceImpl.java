package com.yb.provider.server.providerserver.service;

import com.yb.provider.server.providerserver.entity.User;
import com.yb.provider.server.providerserver.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    public int fincUserCont(){

        return userMapper.findUserCount();
    }

    public List<User> findUser(){

        return userMapper.findUser();
    }

    public User findUserById(int id){

        return userMapper.findUserById(id);
    }

    public String insertUser(String name,String password){

        return userMapper.insertUser(name,password) >0 ? "插入成功!":"插入失败！";
    }
}
