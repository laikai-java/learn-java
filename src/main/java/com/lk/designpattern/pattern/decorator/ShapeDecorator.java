package com.lk.designpattern.pattern.decorator;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 抽象装饰类  实现/继承component 并 持有component实例
 * @Date 2021/1/14 16:42
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratorShape;

    public ShapeDecorator(Shape shape) {
        this.decoratorShape = shape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
