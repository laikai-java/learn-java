package com.lk.designpattern.pattern.proxy.staticproxy;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 16:19
 */
public class Test {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }
}
