package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lqh
 * @create 2021/3/30 上午10:47
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{


    @Override
    public String paymentInfo_OK(Integer id) {
        return "------------PaymentFallbackService fall back-paymentInfo_OK, o(T_T)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------------PaymentFallbackService fall back-paymentInfo)TimeOut, o(T_T)o";
    }
}
