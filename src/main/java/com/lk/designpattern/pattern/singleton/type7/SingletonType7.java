package com.lk.designpattern.pattern.singleton.type7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 静态内部类 实现单例  原理为类的加载机制 初始化时只会有一个线程
 * @Date 2021/1/11 14:39
 */
public class SingletonType7 {
    public static void main(String[] args) {
        final List<Singleton> singletonList = new ArrayList<Singleton>(200);
        for (int i = 0; i < 200;i++){
            System.out.println("第" + i + "个");
            new Thread(() -> {
                System.out.println("当前线程"+Thread.currentThread().getName());
                Singleton instance = Singleton.getInstance();
                singletonList.add(instance);
                System.out.println( "实例地址:" + instance);
            }).start();
        }
        Singleton singleton = singletonList.get(0);
        boolean b = singletonList.stream().allMatch(x -> x.equals(singleton));
        System.out.println(b);
    }
}

class Singleton {

    /**
     * 构造器私有化
     */
    private Singleton() {
    }


    private static class SingletonInstance{
        private  static final Singleton INSTANCE = new Singleton();

    }
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }


}
