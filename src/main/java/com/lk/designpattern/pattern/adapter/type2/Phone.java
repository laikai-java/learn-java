package com.lk.designpattern.pattern.adapter.type2;

/**
 * @Author laikai
 * @Version 1.0
 * @Description client 使用者
 * @Date 2021/1/13 14:13
 */
public class Phone {

    //使用五伏电压充电
    Voltage5V voltage5V;

    public void setVoltage5V(Voltage5V voltage5V) {
        this.voltage5V = voltage5V;
    }

    public void charge(){
        int i = voltage5V.output5v();
        System.out.println("手机充电 : 电压为"+ i);
    }
}
