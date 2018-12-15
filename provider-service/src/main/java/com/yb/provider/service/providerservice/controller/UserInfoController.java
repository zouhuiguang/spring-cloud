package com.yb.provider.service.providerservice.controller;

import com.yb.provider.service.providerservice.api.ServerApi;
import com.yb.provider.service.providerservice.entity.User;
import com.yb.provider.service.providerservice.entity.UserInfo;
import com.yb.provider.service.providerservice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserInfo")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    ServerApi serverApi;

    @Value("ew")
    private String path;

    @GetMapping("/findUserInfo")
    public List<UserInfo> findUserInfo(){
        return userInfoService.findUserInfo();
    }
    @GetMapping("/findCount")
    public int findCount(){
        return userInfoService.findCount();
    }
    @GetMapping("/findUserInfoById")
    public UserInfo findUserInfoById(int id){
        return userInfoService.findUserInfoById(id);
    }
    @GetMapping("/insertUserInfo")
    public String insertUserInfo(String userCode,String userName){
        return userInfoService.insetUserInfo(userCode,userName);
    }
    @GetMapping("/findCountweb")
    public int findUserCount(){
        return serverApi.findUSerCount();
    }
    @GetMapping("/findweb")
    public List<User> findUser(){
        return serverApi.findUser();
    }
    @GetMapping("/findUserByIdweb")
    public User findUserById(int id){
        return serverApi.findUserByID(id);
    }
}

