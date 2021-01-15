package com.lk.designpattern.pattern.adapter.type3;

/**
 * @Author laikai
 * @Version 1.0
 * @Description src 源 适配对象
 * @Date 2021/1/13 14:08
 */
public class Voltage220v {

    public int output220v(){
        int src = 220;
        System.out.println("输出" + src + "伏电压");
        return src;
    }
}
