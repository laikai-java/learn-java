package com.lk.designpattern.pattern.singleton.type4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 懒汉式  ---对方式3进行改进 在方法上加锁 同步方法   效率太低
 * @Date 2021/1/11 14:39
 */
public class SingletonType4 {
    public static void main(String[] args) {
        final List<Singleton> singletonList = new ArrayList<Singleton>(200);
        for (int i = 0; i < 200;i++){
            System.out.println("第" + i + "个");
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("当前线程"+Thread.currentThread().getName());
                    Singleton instance = Singleton.getInstance();
                    singletonList.add(instance);
                    System.out.println( "实例地址:" + instance);
                }
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


    private static Singleton INSTANCE;

    public static synchronized Singleton getInstance() {
        //此处在多线程情况下 创建多个对象实例
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }


}
