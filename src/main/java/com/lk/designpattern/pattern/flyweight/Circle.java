package com.lk.designpattern.pattern.flyweight;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 14:20
 */
public class Circle implements Shape{

    private String color;
    private int x;
    private int y;
    private int radius;


    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
