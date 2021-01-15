package com.lk.designpattern.pattern.adapter.type3;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体的5v适配器 继承抽象电压适配器  重写其中的输出5v电压方法   持有220v电压适配对象
 * @Date 2021/1/14 09:08
 */
public class Power5VAdapter extends PowerAdapter{


    public Power5VAdapter(Voltage220v voltage220v) {
        super(voltage220v);
    }

    @Override
    public int output5V() {
        return voltage220v.output220v()/44;
    }
}
