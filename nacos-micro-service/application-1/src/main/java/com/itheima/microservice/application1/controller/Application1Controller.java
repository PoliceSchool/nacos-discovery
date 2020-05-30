package com.itheima.microservice.application1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujingxiao
 */
@RestController
public class Application1Controller {

    @GetMapping("/service")
    public String service() {
        return "test";
    }
}
