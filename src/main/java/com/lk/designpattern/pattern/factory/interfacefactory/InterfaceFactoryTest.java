package com.lk.designpattern.pattern.factory.interfacefactory;

import com.lk.designpattern.pattern.factory.interfacefactory.hp.HpPcFactory;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 测试接口工厂模式
 * @Date 2021/1/12 13:37
 */
public class InterfaceFactoryTest {
    public static void main(String[] args) {
        PcAbstractFactory factory = new HpPcFactory();
        Keybo keybo = factory.createKeybo();
        Mouse mouse = factory.createMouse();
        keybo.sayHi();
        mouse.sayHi();
    }
}
