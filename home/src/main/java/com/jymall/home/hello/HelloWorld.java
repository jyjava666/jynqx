package com.jymall.home.hello;

import com.jymall.home.hello.entity.Student;
import com.jymall.home.hello.repository.UserMapper;
import com.jymall.home.hello.util.SubjectEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/home")
public class HelloWorld {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String hello() {
        int count = userMapper.getCount();
        List<Student> students = userMapper.selectList(null);
        List<String> collect = students.stream().map(Student::getName).distinct().collect(Collectors.toList());
        return "hello world, i have " + count + " 位学生" + collect.size();
    }

    @GetMapping("/addStudent")
    public String addStudent() {
        Student student= new Student();
        student.setAge(11);
        student.setName("小风");
        student.setScout(new BigDecimal(89));
        student.setSubject(SubjectEnum.YING_YU);
        userMapper.insert(student);
        int count = userMapper.getCount();
        return "hello world, i have " + count + " 位学生";
    }
}
