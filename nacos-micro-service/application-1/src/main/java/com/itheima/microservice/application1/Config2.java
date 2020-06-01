package com.itheima.microservice.application1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author lujingxiao
 */
@Service
public class Config2 {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    public String getName() {
        String name = applicationContext.getEnvironment().getProperty("common.name");
        return name;
    }
}
