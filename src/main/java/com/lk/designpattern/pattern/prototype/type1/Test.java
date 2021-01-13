package com.lk.designpattern.pattern.prototype.type1;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/12 19:00
 */
public class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape);
        shape = ShapeCache.getShape("1");
        System.out.println(shape);
    }
}
