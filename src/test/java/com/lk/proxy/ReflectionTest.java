package com.lk.proxy;


import com.lk.proxy.pro.HelloSeriviceProxy;
import com.lk.proxy.service.HelloService;
import com.lk.proxy.service.impl.HelloServiceImpl;
import org.junit.Test;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2020/11/23 14:23
 */
public class ReflectionTest {

    @Test
    public void testStaticProxy(){
        HelloService target = new HelloServiceImpl();
        HelloSeriviceProxy proxy = new HelloSeriviceProxy(target);
        proxy.say();
    }

    // 测试 修改值类型
    static int f() {
        int ret = 0;
        try {
            return ret;  // 返回 0，finally内的修改效果不起作用
        } finally {
            ret++;
            System.out.println("finally执行");
        }
    }

    // 测试 修改引用类型
    static int[] f2(){
        int[] ret = new int[]{0};
        try {
            return ret;  // 返回 [1]，finally内的修改效果起了作用
        } finally {
            ret[0]++;
            System.out.println("finally执行");
        }
    }

    public static void main(String[] args) {
        int f = ReflectionTest.f();
        System.out.println(f);
        int[] ints = ReflectionTest.f2();
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

}
