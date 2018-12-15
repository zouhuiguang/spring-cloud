package com.yb.provider.server.providerserver.api.hystrix;

import com.yb.provider.server.providerserver.api.ServiceApi;
import com.yb.provider.server.providerserver.entity.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceApiHystrix implements ServiceApi {
    @Override
    public List<UserInfo> findUserInfo() {
        return null;
    }

    @Override
    public int findCount() {
        return 0;
    }

    @Override
    public UserInfo findUserInfoById(int id) {
        return null;
    }
}
