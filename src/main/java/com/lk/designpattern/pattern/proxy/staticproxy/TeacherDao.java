package com.lk.designpattern.pattern.proxy.staticproxy;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 接口实现类  目标对象即被代理的对象
 * @Date 2021/1/15 16:14
 */
public class TeacherDao implements  IteacherDao{
    @Override
    public void teach() {
        System.out.println("老师教书中-----------");
    }
}
