package com.lk.designpattern.pattern.proxy.cglib;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/16 10:13
 */
public class Test {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxy = (TeacherDao)CglibProxy.getProxy(teacherDao);
        proxy.say();
        proxy.teach();
    }
}
