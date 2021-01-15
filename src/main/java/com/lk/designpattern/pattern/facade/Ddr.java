package com.lk.designpattern.pattern.facade;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 14:08
 */
public class Ddr implements Computer{

    @Override
    public void open() {
        System.out.println("内存 启动");
    }
}
