package com.xin.prototype.demo3;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/20 21:07
 * @Version 1.0
 */
public class Student {
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
