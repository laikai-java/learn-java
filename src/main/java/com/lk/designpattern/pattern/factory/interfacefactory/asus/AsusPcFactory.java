package com.lk.designpattern.pattern.factory.interfacefactory.asus;

import com.lk.designpattern.pattern.factory.interfacefactory.Keybo;
import com.lk.designpattern.pattern.factory.interfacefactory.Mouse;
import com.lk.designpattern.pattern.factory.interfacefactory.PcAbstractFactory;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/12 13:36
 */
public class AsusPcFactory implements PcAbstractFactory {
    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new AsusKeybo();
    }
}
