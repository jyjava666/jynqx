package com.jymall.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="application-provider", url = "http://localhost:8902")
public interface FeignService {

    @GetMapping("/home/hello")
    String helloFeign();
}
