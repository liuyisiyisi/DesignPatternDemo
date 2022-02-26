package com.xin.singleton.demo3;

/**
 * @ClassName Singleton
 * @Description 懒汉式-线程不安全
 * @Author liu xin
 * @Date 2022/2/24 20:15
 * @Version 1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton();
        }
        return instance;
    }
}
