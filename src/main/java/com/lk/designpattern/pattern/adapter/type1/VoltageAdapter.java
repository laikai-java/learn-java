package com.lk.designpattern.pattern.adapter.type1;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 类适配器,通过继承源 适配者  并实现 目标类
 * @Date 2021/1/13 14:10
 */
public class VoltageAdapter extends  Voltage220v implements Voltage5V{

    @Override
    public int output5v() {
        //进行适配
        int output220v = output220v();
        return output220v/44;
    }
}
