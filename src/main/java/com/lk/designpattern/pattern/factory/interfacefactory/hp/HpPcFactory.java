package com.lk.designpattern.pattern.factory.interfacefactory.hp;

import com.lk.designpattern.pattern.factory.interfacefactory.Keybo;
import com.lk.designpattern.pattern.factory.interfacefactory.Mouse;
import com.lk.designpattern.pattern.factory.interfacefactory.PcAbstractFactory;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/12 11:50
 */
public class HpPcFactory implements PcAbstractFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
