package com.lk.designpattern.pattern.decorator;

/**
 * @Author laikai
 * @Version 1.0
 * @Description ConcreteComponent 具体构件  圆形
 * @Date 2021/1/14 16:39
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形画画");
    }
}
