package com.jymall.home.hello.util;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum SubjectEnum {
    YU_WEN(1,"语文"),
    SHU_XUE(2,"数学"),
    YING_YU(3,"英语");

    private final int code;
    @EnumValue
    @JsonValue
    private final String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    SubjectEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
