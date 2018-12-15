package com.yb.provider.server.providerserver.controller;

import com.yb.provider.server.providerserver.api.ServiceApi;
import com.yb.provider.server.providerserver.entity.User;
import com.yb.provider.server.providerserver.entity.UserInfo;
import com.yb.provider.server.providerserver.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    ServiceApi serviceApi;


    @GetMapping("/findcount")
    public int findUserCount(){

       return  userService.fincUserCont();
    }

    @GetMapping("/findcountweb")
    public int findCount(){
        return serviceApi.findCount();
    }

    @GetMapping("/findUserInfoweb")
    public List<UserInfo> findUserInfo(){
        return serviceApi.findUserInfo();
    }

    @GetMapping("/find")
    public List<User> findUser(){
        System.out.println("服务被调用...");
        return userService.findUser();
    }

    @GetMapping("/findUserById")
    public User findUserById(int id){
        System.out.println("服务被调用...");
        return userService.findUserById(id);
    }
    @GetMapping("/insertUser")
    public String insertUser(String name,String password){

        return userService.insertUser(name,password);
    }

    @GetMapping("/test")
    public String test(){

        return "测试数据。。。。。";
    }
}
