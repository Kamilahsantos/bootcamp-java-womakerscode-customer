package com.womakerscode.bootcampjava.customerwomakerscode.controller;

import com.womakerscode.bootcampjava.customerwomakerscode.client.OrderFeignClient;
import com.womakerscode.bootcampjava.customerwomakerscode.response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openfeign")
public class OrderController {

    @Autowired
    OrderFeignClient orderFeignClient;


    @GetMapping("/{id}")
    public OrderResponse getOrderById(@PathVariable String id) {
        return orderFeignClient.findOrderById(id);


    }
}
