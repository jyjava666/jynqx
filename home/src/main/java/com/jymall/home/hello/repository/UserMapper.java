package com.jymall.home.hello.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jymall.home.hello.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<Student> {
    int getCount();
}
