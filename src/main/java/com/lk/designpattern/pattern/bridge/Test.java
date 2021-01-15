package com.lk.designpattern.pattern.bridge;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/14 14:26
 */
public class Test {
    public static void main(String[] args) {
        Color black = new Black();
        Shape rectangle = new Rectangle();
        rectangle.setColor(black);
        rectangle.draw();

        Shape circle = new Circle();
        circle.setColor(black);
        circle.draw();
    }
}
