package com.lk.designpattern.pattern.bridge;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 正方形
 * @Date 2021/1/14 14:25
 */
public class Rectangle extends  Shape{

    @Override
    void draw() {
        color.bepaint("正方形");
    }
}
