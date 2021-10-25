package com.example.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PmsProducerApplication {
    public static void main(String[] args){
        SpringApplication.run(PmsProducerApplication.class,args);
    }
}
