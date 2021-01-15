package com.lk.designpattern.pattern.bridge;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/14 14:24
 */
public class White implements Color {

    @Override
    public void bepaint(String name) {
        System.out.println("白色的: " + name);
    }
}
