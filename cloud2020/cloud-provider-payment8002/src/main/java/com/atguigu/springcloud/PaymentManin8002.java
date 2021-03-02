package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lqh
 * @create 2021/2/25 下午4:01
 */

@SpringBootApplication
@EnableEurekaClient
public class PaymentManin8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentManin8002.class, args);
    }

}
