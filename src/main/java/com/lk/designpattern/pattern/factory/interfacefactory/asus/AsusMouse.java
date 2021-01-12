package com.lk.designpattern.pattern.factory.interfacefactory.asus;

import com.lk.designpattern.pattern.factory.interfacefactory.Mouse;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 华硕 鼠标
 * @Date 2021/1/12 13:34
 */
public class AsusMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("华硕 鼠标say hi ");
    }
}
