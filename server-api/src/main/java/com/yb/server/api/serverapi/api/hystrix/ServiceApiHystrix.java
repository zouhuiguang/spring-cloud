package com.yb.server.api.serverapi.api.hystrix;

import com.yb.server.api.serverapi.api.ServiceApi;
import com.yb.server.api.serverapi.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceApiHystrix implements ServiceApi {
    @Override
    public List<User> findUser() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setName("错误！");
        user.setPassword("错误！");
        list.add(user);
        return list;
    }

    @Override
    public User findUserById(int id) {
        User user = new User();
        user.setName("错误！");
        user.setPassword("错误！");
        return user;
    }

    @Override
    public String test() {
        return "这里是熔断返回的测试数据...";
    }
}
