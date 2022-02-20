package com.xin.prototype.demo2;

/**
 * @ClassName Citation
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/20 21:04
 * @Version 1.0
 */
//奖状类
public class Citation implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}



