package com.lk.designpattern.pattern.factory.simple;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 披萨产品 抽象产品
 * @Date 2021/1/12 09:50
 */
public abstract class Pizza {

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();


}
