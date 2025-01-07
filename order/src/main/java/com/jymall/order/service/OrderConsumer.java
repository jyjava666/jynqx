package com.jymall.order.service;

import com.jymall.order.client.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderConsumer {
    @Autowired
    private FeignService feignClient;

    @GetMapping("/hello")
    public String sayHello() {
        String hello = feignClient.helloFeign();
        return hello+" this is order";
    }

}
