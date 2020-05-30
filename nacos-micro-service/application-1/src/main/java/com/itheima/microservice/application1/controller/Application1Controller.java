package com.itheima.microservice.application1.controller;

import com.itheima.microservice.service1.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujingxiao
 */
@RestController
public class Application1Controller {

    @org.apache.dubbo.config.annotation.Reference
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service() {
        String service = consumerService.service();
        return service;
    }
}
