package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lqh
 * @create 2021/2/25 下午4:01
 */

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class PaymentManin8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentManin8001.class, args);
    }

}
