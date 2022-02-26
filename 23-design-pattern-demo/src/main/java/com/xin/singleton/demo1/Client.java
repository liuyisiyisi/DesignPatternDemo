package com.xin.singleton.demo1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/24 20:19
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);

    }
}
