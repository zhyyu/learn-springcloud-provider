package com.zhyyu.learn.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LearnSpringcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringcloudProviderApplication.class, args);
    }

}
