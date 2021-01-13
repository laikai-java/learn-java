package com.lk.designpattern.pattern.prototype.type1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/12 16:35
 */
public class ShapeCache {

    public static final Map<String, Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(String id) {
        return (Shape) SHAPE_MAP.get(id).clone();
    }

    public static void loadCache() {
        Shape circle = new CircleShape();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);
        Shape square = new SquareShape();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);
    }
}
