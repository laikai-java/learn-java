package com.lk.designpattern.pattern.factory.simple;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/12 09:53
 */
public class ChessePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Chesse准备");
    }

    @Override
    public void bake() {
        System.out.println("Chesse烘烤");
    }

    @Override
    public void cut() {
        System.out.println("Chesse切糕");
    }

    @Override
    public void box() {
        System.out.println("Chesse打包");
    }
}
