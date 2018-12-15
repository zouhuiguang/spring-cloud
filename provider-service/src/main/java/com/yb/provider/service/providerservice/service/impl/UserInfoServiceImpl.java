package com.yb.provider.service.providerservice.service.impl;

import com.yb.provider.service.providerservice.entity.UserInfo;
import com.yb.provider.service.providerservice.mapper.UserInfoMapper;
import com.yb.provider.service.providerservice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    /**
     * 查询所有用户信息
     */
    public List<UserInfo> findUserInfo() {

        return userInfoMapper.findUserInfo();
    }

    @Override
    /**
     * 查询用户数量
     */
    public int findCount() {

        return userInfoMapper.findCount();
    }

    @Override
    /**
     * 根据用户ID查询用户
     */
    public UserInfo findUserInfoById(int id) {

        return userInfoMapper.findUserInfoById(id);
    }

    @Override
    /**
     * 插入一个用户信息
     */
    public String insetUserInfo(String userCode, String userName) {
        return userInfoMapper.insertUserInfo(userCode,userName)>0?"插入成功A！":"插入失败A！";
    }
}
