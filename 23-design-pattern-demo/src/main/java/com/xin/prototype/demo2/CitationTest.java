package com.xin.prototype.demo2;

/**
 * @ClassName CitationTest
 * @Description TODO
 * @Author liu xin
 * @Date 2022/2/20 21:05
 * @Version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的名字修改李四
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}