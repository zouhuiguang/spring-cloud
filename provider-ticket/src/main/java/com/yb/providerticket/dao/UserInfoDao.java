package com.yb.providerticket.dao;

import com.yb.providerticket.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserInfoDao {
    @Select("select * from user")
    public List<UserInfo> findUser();
}
