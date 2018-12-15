package com.yb.providerticket.server;

import com.yb.providerticket.dao.UserDao;
import com.yb.providerticket.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    UserDao userDao;

    public List<User> findUser(){
        return userDao.findUser();
    }
    public String getTicet(){

        return "8003请求，测试返回数据C。。。";
    }

    public String test(){

        return "8004请求，测试返回数据C。。。";
    }

}
