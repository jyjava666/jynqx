package com.jymall.home.hello.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int getCount();
}
