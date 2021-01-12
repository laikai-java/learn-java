package com.lk.designpattern.pattern.factory.simple;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体产品
 * @Date 2021/1/12 09:53
 */
public class DefaultPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("DefaultPizza准备");
    }

    @Override
    public void bake() {
        System.out.println("DefaultPizza烘烤");
    }

    @Override
    public void cut() {
        System.out.println("DefaultPizza切糕");
    }

    @Override
    public void box() {
        System.out.println("DefaultPizza打包");
    }
}
