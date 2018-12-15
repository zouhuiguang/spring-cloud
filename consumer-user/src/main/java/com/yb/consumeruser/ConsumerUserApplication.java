package com.yb.consumeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient//开启发现服务功能
@SpringBootApplication
@EnableFeignClients   //
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }

   // @LoadBalanced //使用负载均衡机制
   // @Bean
   // public RestTemplate restTemplate() {
    //    return new RestTemplate();
   // }
}
