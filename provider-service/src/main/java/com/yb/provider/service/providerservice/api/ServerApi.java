package com.yb.provider.service.providerservice.api;

import com.yb.provider.service.providerservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider-server")
public interface ServerApi {

    @GetMapping("/findcount")
    public int findUSerCount();
    @GetMapping("/find")
    public List<User> findUser();
    @GetMapping("/findUserById")
    public User findUserByID(int id);
}
