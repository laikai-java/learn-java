package com.lk.designpattern.pattern.bridge;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 黑色
 * @Date 2021/1/14 14:24
 */
public class Black implements Color {

    @Override
    public void bepaint(String name) {
        System.out.println("黑色的: " + name);
    }
}
