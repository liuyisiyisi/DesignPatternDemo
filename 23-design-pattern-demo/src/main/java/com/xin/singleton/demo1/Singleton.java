package com.xin.singleton.demo1;

/**
 * @ClassName Singleton
 * @Description 饿汉式-静态成员变量
 * @Author liu xin
 * @Date 2022/2/24 20:15
 * @Version 1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
