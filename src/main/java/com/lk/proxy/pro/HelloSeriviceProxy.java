package com.lk.proxy.pro;

import com.lk.proxy.service.HelloService;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 静态代理
 * @Date 2020/11/23 14:28
 */
public class HelloSeriviceProxy implements HelloService {

    /**
     * 代理对象
     */
    HelloService target;

    public HelloSeriviceProxy(HelloService target) {
        this.target = target;
    }

    public void say() {
        System.out.println("执行前操作***");
        target.say();
        System.out.println("执行后操作***");
    }
}
