package com.yb.server.api.serverapi.api;

import com.yb.server.api.serverapi.api.hystrix.ServiceApiHystrix;
import com.yb.server.api.serverapi.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provdier-server" ,fallback = ServiceApiHystrix.class)
public interface ServiceApi {
    @GetMapping("/user/find")
    public List<User> findUser();
    @GetMapping("/user/findUserById")
    public User findUserById(int id);
    @GetMapping("/user/test")
    public String test();
}
