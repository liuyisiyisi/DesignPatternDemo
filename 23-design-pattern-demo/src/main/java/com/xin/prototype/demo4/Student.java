package com.xin.prototype.demo4;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/20 21:07
 * @Version 1.0
 */
public class Student implements Serializable {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
