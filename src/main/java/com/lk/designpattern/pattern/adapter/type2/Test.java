package com.lk.designpattern.pattern.adapter.type2;


/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/13 14:13
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter v = new VoltageAdapter();
        v.setVoltage220v(new Voltage220v());
        phone.setVoltage5V(v);
        phone.charge();
    }
}
