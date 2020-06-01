package com.itheima.microservice.application1.controller;

import com.itheima.microservice.application1.Config;
import com.itheima.microservice.application1.Config2;
import com.itheima.microservice.service1.api.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujingxiao
 */
@RestController
public class Application1Controller {

    @org.apache.dubbo.config.annotation.Reference
    ConsumerService consumerService;

    @Autowired
    private Config config;

    @Autowired
    private Config2 config2;

    @GetMapping("/service")
    public String service() {
        String service = consumerService.service();
        System.out.println("config.getUseLocalCache: " + config.getUseLocalCache());
        System.out.println("config2.getName: " + config2.getName());
        return service;
    }
}
