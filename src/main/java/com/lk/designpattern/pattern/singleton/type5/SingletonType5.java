package com.lk.designpattern.pattern.singleton.type5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 懒汉式  ---有人认为在方法上加锁 效率过低 就对if后面的代码块进行加锁  实际上还是会出现多线程 创建不同实例的情况
 * @Date 2021/1/11 14:39
 */
public class SingletonType5 {
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

    public static Singleton getInstance() {

        if (INSTANCE == null){
            //此处加锁  毫无意义 多线程情况下 多个线程进入if语句后,虽然 实例化对象过程被锁
            //但当前一个线程实例化对象后,后一个线程也实例化了对象
            synchronized (Singleton.class){
                INSTANCE = new Singleton();
            }

        }
        return INSTANCE;
    }


}
