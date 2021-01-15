package com.lk.designpattern.pattern.bridge;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 圆形
 * @Date 2021/1/14 14:25
 */
public class Circle extends  Shape{

    @Override
    void draw() {
        color.bepaint("圆形");
    }
}
