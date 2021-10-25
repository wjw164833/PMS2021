package com.example.pms.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.example.pms.admin"})
@MapperScan("com.example.pms.admin.dao")
public class PmsAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsAdminApplication.class, args);
    }
}
