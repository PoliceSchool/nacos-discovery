package com.itheima.microservice.service2.server;

import com.itheima.microservice.service2.api.ProviderService;

/**
 * @author lujingxiao
 */
@org.apache.dubbo.config.annotation.Service // 标记此类的方法暴露为dubbo接口
public class ProviderServiceImpl implements ProviderService {

    public String service() {
        return "Provider invoke";
    }
}
