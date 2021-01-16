package com.lk.designpattern.pattern.proxy.cglib;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 普通的类   是private或是final类修饰的方法,则不会被重写。
 * @Date 2021/1/16 10:07
 */
public class TeacherDao {

    public void teach(){
        System.out.println("老师教书中");
    }

    public final void say(){
        System.out.println("老师说话中");
    }

    private void sleep(){
        System.out.println("老师睡觉中");
    }
}
