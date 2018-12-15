package com.yb.providerticket.dao;

import com.yb.providerticket.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserDao {
    @Select("select * from user")
    public List<User> findUser();
}
