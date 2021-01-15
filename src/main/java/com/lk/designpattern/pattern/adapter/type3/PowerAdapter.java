package com.lk.designpattern.pattern.adapter.type3;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 抽象的电源适配器   空实现 输出电压接口
 * @Date 2021/1/14 09:06
 */
public abstract class PowerAdapter implements DCOutput {
    protected Voltage220v voltage220v;

    public PowerAdapter(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }
    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output9V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }
}
