package com.lk.designpattern.pattern.factory.interfacefactory.hp;

import com.lk.designpattern.pattern.factory.interfacefactory.Keybo;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 惠普键盘
 * @Date 2021/1/12 11:49
 */
public class HpKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("惠普键盘say hi");
    }
}
