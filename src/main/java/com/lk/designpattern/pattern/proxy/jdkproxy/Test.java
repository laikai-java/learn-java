package com.lk.designpattern.pattern.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/16 09:53
 */
public class Test {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        IteacherDao proxyObject = (IteacherDao)proxy.getProxyObject();
        proxyObject.teach();
        proxyObject.say();
        System.out.println(proxyObject.getClass());
    }
}
