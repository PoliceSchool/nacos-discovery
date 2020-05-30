package com.itheima.microservice.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lujingxiao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application1Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Application1Bootstrap.class, args);
    }
}
