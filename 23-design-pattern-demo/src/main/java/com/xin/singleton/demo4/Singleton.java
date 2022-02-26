package com.xin.singleton.demo4;

/**
 * @ClassName Singleton
 * @Description 懒汉式-线程安全 synchronized
 * @Author liu xin
 * @Date 2022/2/24 20:15
 * @Version 1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
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
