package com.womakerscode.bootcampjava.customerwomakerscode.client;

import com.womakerscode.bootcampjava.customerwomakerscode.response.OrderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order", url = "http://localhost:8081")

public interface OrderFeignClient {


    @RequestMapping(method = RequestMethod.GET, value = "/order/{id}" )
    OrderResponse findOrderById(@PathVariable(name = "id") String id);
}
