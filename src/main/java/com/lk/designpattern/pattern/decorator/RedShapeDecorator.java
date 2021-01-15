package com.lk.designpattern.pattern.decorator;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/14 16:46
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("使用红色线条");
        decoratorShape.draw();

    }
}
