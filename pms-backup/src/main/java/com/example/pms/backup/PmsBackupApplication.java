package com.example.pms.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.example.pms"})
public class PmsBackupApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsBackupApplication.class, args);
    }
}

