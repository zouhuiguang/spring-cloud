package com.yb.consumeruser.dao;

import com.yb.consumeruser.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "provider-ticket")
public interface UserDao {
    @GetMapping("/test")
    public String test();

    @GetMapping("/tess")
    public String tess();

    @GetMapping("/find")
    public List<User> find();
}
