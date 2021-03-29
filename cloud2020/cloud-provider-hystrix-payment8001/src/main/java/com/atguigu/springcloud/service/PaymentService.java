package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author lqh
 * @create 2021/3/29 下午2:10
 */
@Service
public class PaymentService {
    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池：  " + Thread.currentThread().getName() + "paymentInfo_OK,id:  " + id + "\t" + "O(n_n)O哈哈～";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：  " + Thread.currentThread().getName() + "paymentInfo_TimeOut,id:  " + id + "\t" + "O(n_n)O哈哈～"+"耗时"+timeNumber+"秒";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：  " + Thread.currentThread().getName() + "paymentInfo_TimeOutHandler,id:  " + id + "\t" + "O(T-T)O哈哈～"+"耗时秒";
    }


}
