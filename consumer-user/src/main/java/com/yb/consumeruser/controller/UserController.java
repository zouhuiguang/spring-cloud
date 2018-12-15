package com.yb.consumeruser.controller;

import com.yb.consumeruser.dao.UserDao;
import com.yb.consumeruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    //@Autowired
    //RestTemplate restTemplate;

    @Autowired
    UserDao userDao;

    @GetMapping("/buy")
    public String buyTicket() {
        //String s = restTemplate.getForObject("http://PROVIDER-TICKET/tess", String.class);
        String s =  userDao.test();
        return  s ;
    }

    @GetMapping("/test")
    public String test(){
        //String s = restTemplate.getForObject("http://PROVIDER-TICKET/test",String.class);
        String s  = userDao.tess();
        return s ;
    }
    @GetMapping("/find")
    public List<User> find(){
        return userDao.find();
    }


}
