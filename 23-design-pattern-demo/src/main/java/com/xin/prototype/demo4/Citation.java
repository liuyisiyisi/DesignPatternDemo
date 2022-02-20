package com.xin.prototype.demo4;

import java.io.Serializable;

/**
 * @ClassName Citation
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/20 21:07
 * @Version 1.0
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
