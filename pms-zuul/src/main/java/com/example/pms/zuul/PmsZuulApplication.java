package com.example.pms.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PmsZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsZuulApplication.class, args);
	}
	
}