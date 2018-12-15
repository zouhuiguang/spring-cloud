package com.yb.provider.server.providerserver.api;

import com.yb.provider.server.providerserver.api.hystrix.ServiceApiHystrix;
import com.yb.provider.server.providerserver.entity.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider-service" ,fallback = ServiceApiHystrix.class)
public interface ServiceApi {
    @GetMapping("/findUserInfo")
    public List<UserInfo> findUserInfo();
    @GetMapping("/findCount")
    public int findCount();
    @GetMapping("/findUserInfoById")
    public UserInfo findUserInfoById(int id);
}
