package com.xiaoxu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiaoxu.gulimall.ware.dao")
public class WareApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class,args);
    }
}
