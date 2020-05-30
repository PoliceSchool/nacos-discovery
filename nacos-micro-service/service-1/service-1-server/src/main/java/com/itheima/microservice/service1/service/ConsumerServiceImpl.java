package com.itheima.microservice.service1.service;

import com.itheima.microservice.service1.api.ConsumerService;
import com.itheima.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @author lujingxiao
 */
@org.apache.dubbo.config.annotation.Service // 标记此类的方法暴露为dubbo接口
public class ConsumerServiceImpl implements ConsumerService {

    @org.apache.dubbo.config.annotation.Reference
    private ProviderService providerService;

    /**
     * dubbo接口实现内容
     *
     * @return string
     */
    public String service() {
        String service = providerService.service();
        return "Consumer invoke |" + service;
    }
}
