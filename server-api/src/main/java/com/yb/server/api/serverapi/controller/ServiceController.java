package com.yb.server.api.serverapi.controller;

import com.yb.server.api.serverapi.api.ServiceApi;
import com.yb.server.api.serverapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    ServiceApi serviceApi;

    @GetMapping("/find")
    @ResponseBody
    public List<User> find(){
        List<User> list = serviceApi.findUser();
        return list;
    }

    @GetMapping("/findUserById")
    public User findUserById(int id){

        return serviceApi.findUserById(id);
    }

    @GetMapping("/test")
    public String test(){

       return serviceApi.test();
    }
}
