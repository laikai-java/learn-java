package com.lk.designpattern.pattern.singleton.type8;


import java.util.ArrayList;
import java.util.List;

/**
 * 枚举实现单例
 */
public class SingletonType8 {
    public static void main(String[] args) {
        final List<Singleton> singletonList = new ArrayList<Singleton>(200);
        for (int i = 0; i < 200;i++){
            System.out.println("第" + i + "个");
            new Thread(() -> {
                System.out.println("当前线程"+Thread.currentThread().getName());
                Singleton instance = Singleton.INSTANCE;
                singletonList.add(instance);
                System.out.println( "实例地址:" + instance);
            }).start();
        }
        Singleton singleton = singletonList.get(0);
        boolean b = singletonList.stream().allMatch(x -> x.equals(singleton));
        System.out.println(b);
    }
}

enum Singleton{
    INSTANCE;

    public static void say(){
        System.out.println("枚举");
    }
}
