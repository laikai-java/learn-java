package com.lk.designpattern.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 代理
 * @Date 2021/1/15 16:25
 */
public class TeacherDaoProxy {

    private Object target;

    public TeacherDaoProxy(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
       return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk动态代理 开始");
                Object invoke = method.invoke(target, args);
                System.out.println("jdk动态代理 结束");
                return invoke;
            }
        });
    }
}
