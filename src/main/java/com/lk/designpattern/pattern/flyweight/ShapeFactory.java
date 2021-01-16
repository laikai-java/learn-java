package com.lk.designpattern.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 享元工厂
 * @Date 2021/1/15 14:21
 */
public class ShapeFactory {
    private static final Map<String,Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(String color){
        Shape shape = SHAPE_MAP.get(color);
        if (shape == null){
            shape = new Circle(color);
            SHAPE_MAP.put(color,shape);
            System.out.println("Creating circle of color : " + color);
        }
        return shape;
    }
}
