package com.itheima.microservice.application1.controller;

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
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/service")
    public String service() {
        String service = consumerService.service();
        String name = applicationContext.getEnvironment().getProperty("common.name");
        System.out.println(name);
        return service;
    }
}
