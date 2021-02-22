package com.lk.jvm.string;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/29 09:55
 */
public class Test {
    public static void main(String[] args) {
        String a1 = "Test";
        String s = "111";
        String str = new String("111");
        String data = a1 +s ;
        str.intern();
    }
}
