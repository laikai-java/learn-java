package com.lk.designpattern.pattern.factory.interfacefactory;

/**
 * 抽象工厂  pc工厂  后续每个厂家都会实现该接口
 */
public interface PcAbstractFactory {
    Mouse createMouse();
    Keybo createKeybo();
}
