package com.itheima.microservice.application1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujingxiao
 */
@RefreshScope
@Service
public class Config {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    public boolean getUseLocalCache() {
        return useLocalCache;
    }


}
