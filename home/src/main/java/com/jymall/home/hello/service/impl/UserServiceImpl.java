package com.jymall.home.hello.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jymall.home.hello.entity.Student;
import com.jymall.home.hello.repository.UserMapper;
import com.jymall.home.hello.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl extends ServiceImpl<UserMapper, Student>  implements UserService {
}
