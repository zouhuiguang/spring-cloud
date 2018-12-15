package com.yb.provider.service.providerservice.mapper;

import com.yb.provider.service.providerservice.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserInfoMapper extends Mapper<UserInfo> {

    public List<UserInfo> findUserInfo();

    public int findCount();

    public UserInfo findUserInfoById(@Param("id") int id);

    public int insertUserInfo(@Param("userCode") String userCode,@Param("userName") String userName);

}
