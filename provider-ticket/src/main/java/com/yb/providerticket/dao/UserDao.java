package com.yb.providerticket.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="provider-server")
public interface UserDao {

}
