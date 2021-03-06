package com.itheima.microservice.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lujingxiao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service1Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class, args);
    }
}
