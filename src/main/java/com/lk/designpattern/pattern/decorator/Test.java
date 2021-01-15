package com.lk.designpattern.pattern.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/14 15:29
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        Shape circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();

        Shape rectangle = new Rectangle();
        new RedShapeDecorator(rectangle).draw();

    }
}
