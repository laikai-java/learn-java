package com.lk.designpattern.pattern.factory.interfacefactory.hp;

import com.lk.designpattern.pattern.factory.interfacefactory.Mouse;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 惠普鼠标
 * @Date 2021/1/12 11:48
 */
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("hp鼠标say  hi");
    }
}
