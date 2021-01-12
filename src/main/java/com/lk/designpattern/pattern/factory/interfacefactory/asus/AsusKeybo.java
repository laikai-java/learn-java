package com.lk.designpattern.pattern.factory.interfacefactory.asus;

import com.lk.designpattern.pattern.factory.interfacefactory.Keybo;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/12 13:35
 */
public class AsusKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("华硕键盘---say hi");
    }
}
