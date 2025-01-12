package com.jymall.home.hello.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.jymall.home.hello.entity.Student;
import com.jymall.home.hello.util.SubjectEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testListStudent() {
       /* List<Student> list1 = userService.lambdaQuery().select(Student::getName).ge(Student::getAge, 20).list();
        System.out.println(list1);*/
        //QueryWrapper<Student> wrapper = new QueryWrapper<Student>().select("name").ge("age", 20);
        // 这种查询值有问题，字段都是0
        List<Student> list = userService.list();
        list.forEach(vo -> {
            if (vo.getSubject() == SubjectEnum.SHU_XUE) {
                System.out.println(vo);
            }
        });
    }

}