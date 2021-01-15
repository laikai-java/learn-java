package com.lk.designpattern.pattern.adapter.type3;


/**
 * 输出各种电压的接口
 */
public interface DCOutput {
    int output5V();
    int output9V();
    int output12V();
    int output24V();
}
