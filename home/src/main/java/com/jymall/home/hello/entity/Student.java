package com.jymall.home.hello.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jymall.home.hello.util.SubjectEnum;
import lombok.Data;

import java.math.BigDecimal;

@TableName("student")
public class Student {
    // 不设置类型默认按照雪花算法生成id
    @TableId(type = IdType.AUTO)
    private long id;
    @TableField("name")
    private String name;
    private SubjectEnum subject;
    private BigDecimal scout;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubjectEnum getSubject() {
        return subject;
    }

    public void setSubject(SubjectEnum subject) {
        this.subject = subject;
    }

    public BigDecimal getScout() {
        return scout;
    }

    public void setScout(BigDecimal scout) {
        this.scout = scout;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject.getName() + '\'' +
                ", scout=" + scout +
                ", age=" + age +
                '}';
    }
}
