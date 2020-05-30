package com.itheima.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lujingxiao
 */
@FeignClient(value = "quick-provider")
public interface ProviderClient {

    @GetMapping("/service")
    String service();
}
