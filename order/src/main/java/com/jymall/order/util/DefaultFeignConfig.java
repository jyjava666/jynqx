package com.jymall.order.util;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 配置feign日志
 *
 */
public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }

}
