package com.lk.jvm.heap;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/23 10:58
 */
public class HeapInstanceTest {
    byte [] buffer = new byte[new Random().nextInt(1024 * 200)];
    public static void main(String[] args) throws InterruptedException {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            Thread.sleep(10);
        }
    }
}
