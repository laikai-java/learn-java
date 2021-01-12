package com.lk.designpattern.pattern.factory.simple;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体产品
 * @Date 2021/1/12 09:53
 */
public class ClaimPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ClaimPizza准备");
    }

    @Override
    public void bake() {
        System.out.println("ClaimPizza烘烤");
    }

    @Override
    public void cut() {
        System.out.println("ClaimPizza切糕");
    }

    @Override
    public void box() {
        System.out.println("ClaimPizza打包");
    }
}
