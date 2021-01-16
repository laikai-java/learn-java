package com.lk.designpattern.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author laikai
 * @Version 1.0
 * @Description cglib动态代理
 * @Date 2021/1/16 10:09
 */
public class CglibProxy implements MethodInterceptor {

    Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 动态代理开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib 动态代理结束");
        return invoke;
    }

    /**
     * 返回一个代理对象  底层通过ASM框架对字节码进行操作
     * @param target
     * @return
     */
    public static Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        // 设置需要代理的对象
        enhancer.setSuperclass(target.getClass());
        // 设置代理人
        enhancer.setCallback(new CglibProxy(target));
        return enhancer.create();
    }
}
