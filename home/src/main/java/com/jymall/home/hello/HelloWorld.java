package com.jymall.home.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloWorld {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
