package com.lk.designpattern.pattern.command;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 接收者
 * @Date 2021/1/19 09:41
 */
public class Television {

    public void open(){
        System.out.println("电视机打开了");
    }
    public void close(){
        System.out.println("电视机关闭了");
    }
    public void change(){
        System.out.println("电视机换台了");
    }
}
