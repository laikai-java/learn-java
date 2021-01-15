package com.lk.designpattern.pattern.decorator;

/**
 * @Author laikai
 * @Version 1.0
 * @Description ConcreteComponent 具体构件  方形
 * @Date 2021/1/14 16:39
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("方形画画");
    }
}
