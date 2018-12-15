package com.yb.providerticket.server;

import com.yb.providerticket.dao.UserInfoDao;
import com.yb.providerticket.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    UserInfoDao userDao;

    public List<UserInfo> findUser(){
        return userDao.findUser();
    }
    public String getTicet(){

        return "8003请求，测试返回数据C。。。";
    }

    public String test(){

        return "8004请求，测试返回数据C。。。";
    }

}
