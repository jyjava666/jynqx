package com.jymall.home.hello;

import com.jymall.home.hello.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloWorld {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String hello() {
        int count = userMapper.getCount();
        return "hello world, i have " + count + " 位学生";
    }
}
