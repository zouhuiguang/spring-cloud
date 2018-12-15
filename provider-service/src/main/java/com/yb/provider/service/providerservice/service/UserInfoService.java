package com.yb.provider.service.providerservice.service;

import com.yb.provider.service.providerservice.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    public List<UserInfo> findUserInfo();

    public int findCount();

    public UserInfo findUserInfoById(int id);

    public String insetUserInfo(String userCode,String usreName);
}
