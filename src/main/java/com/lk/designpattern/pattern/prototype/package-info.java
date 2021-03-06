/**
 * 原型模式 对对象就行复制
 * 浅拷贝 和深拷贝
 * 浅拷贝 :对象中的基本数据类型 为值传递    引用类型 复制 的是引用的地址
 * 深拷贝: 对引用类型的拷贝是通过新建对象来确定的    与原对象中的引用对象不是同一个了
 *
 * 实现原型模式的方式
 * 1、实现clone接口  重写clone方法
 * 2、通过序列化与反序列化对象的方式 实现拷贝
 */
package com.lk.designpattern.pattern.prototype;