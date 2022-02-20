package com.xin.prototype.demo1;

/**
 * @ClassName PrototypeTest
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/20 17:34
 * @Version 1.0
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizedType r1 = new RealizedType();
        RealizedType r2 = r1.clone();

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));// false
    }
}
