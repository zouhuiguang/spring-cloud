package com.yb.provider.server.providerserver.mapper;

import com.yb.provider.server.providerserver.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    public int findUserCount();

    public List<User> findUser();

    public User findUserById(@Param("id")int id);

    public int insertUser(@Param("name") String name,@Param("password") String password);
}
