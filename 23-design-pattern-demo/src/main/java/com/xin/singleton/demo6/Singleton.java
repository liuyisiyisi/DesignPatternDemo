package com.xin.singleton.demo6;

/**
 * @ClassName Singleton
 * @Description 懒汉式-静态内部类
 * @Author liu xin
 * @Date 2022/2/24 20:15
 * @Version 1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
