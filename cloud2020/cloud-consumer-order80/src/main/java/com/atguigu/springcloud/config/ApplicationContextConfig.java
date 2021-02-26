package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lqh
 * @create 2021/2/26 下午1:28
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplete() {
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">
