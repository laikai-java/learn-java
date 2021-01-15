package com.lk.designpattern.pattern.adapter.type2;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 对象适配器,通过组合源 适配者  并实现 目标类
 * @Date 2021/1/13 14:10
 */
public class VoltageAdapter implements Voltage5V{

    Voltage220v voltage220v;

    public void setVoltage220v(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5v() {
        int  des = 0;
        //进行适配
        System.out.println("开始适配---");
        if (voltage220v !=null){
            des = voltage220v.output220v()/44;
        }
        return des;
    }
}
