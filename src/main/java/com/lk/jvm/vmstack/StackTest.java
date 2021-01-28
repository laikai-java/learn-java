package com.lk.jvm.vmstack;

import java.util.Date;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/21 15:40
 */
public class StackTest {
    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        Date date = new Date();
        stackTest.test1();
    }

    public void test1(){
        int  num = 0;
        String str = "str";
        int i = test2();
    }

    public int test2() {
        int a = 10;
        int b = 20;
        return a+b;
    }
    public void localvar(){
        int a = 2;
        {
            //槽位的重复利用
            int b = 0;
            a = b+2;
        }
        int c  =  4;
    }
}
