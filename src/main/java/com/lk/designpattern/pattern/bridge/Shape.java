package com.lk.designpattern.pattern.bridge;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 形状抽象类  使用color 实现类
 * @Date 2021/1/14 14:22
 */
public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void draw();


}
