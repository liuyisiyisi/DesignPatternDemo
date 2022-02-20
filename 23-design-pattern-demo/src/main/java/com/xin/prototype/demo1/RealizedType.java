package com.xin.prototype.demo1;

/**
 * @ClassName RealizedType
 * @Description
 *     浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 *     深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 * @Author liu xin
 * @Date 2022/2/20 17:33
 * @Version 1.0
 */
public class RealizedType implements Cloneable {
    public RealizedType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected RealizedType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizedType) super.clone();
    }
}


