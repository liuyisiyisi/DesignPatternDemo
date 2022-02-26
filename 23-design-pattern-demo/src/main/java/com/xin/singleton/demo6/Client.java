package com.xin.singleton.demo6;


/**
 * @ClassName Client
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/24 20:19
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 多线程 线程安全
        new MyThread().start();
        new MyThread().start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}
