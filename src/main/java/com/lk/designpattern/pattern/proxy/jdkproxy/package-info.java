/**
 * JDK 自带的动态代理
 *
 *  java.lang.reflect.Proxy:生成动态代理类和对象；
 *  java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
 * 对真实角色的代理访问。
 *
 * 每次通过 Proxy 生成的代理类对象都要指定对应的处理器对象。
 */
package com.lk.designpattern.pattern.proxy.jdkproxy;