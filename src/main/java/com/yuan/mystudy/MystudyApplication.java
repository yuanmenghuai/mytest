package com.yuan.mystudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MystudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MystudyApplication.class, args);
    }

}
