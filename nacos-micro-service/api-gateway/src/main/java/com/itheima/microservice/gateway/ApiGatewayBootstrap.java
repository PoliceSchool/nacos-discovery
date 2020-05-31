package com.itheima.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lujingxiao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApiGatewayBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayBootstrap.class, args);
    }
}
