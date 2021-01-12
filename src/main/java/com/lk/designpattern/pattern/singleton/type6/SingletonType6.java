package com.lk.designpattern.pattern.singleton.type6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 懒汉式  ---有人认为在方法上加锁 效率过低 就对if后面的代码块进行加锁  实际上还是会出现多线程 创建不同实例的情况 但是这个方法行不通  所以引出 双重锁校验
 *
 * 延迟加载 效率高
 * @Date 2021/1/11 14:39
 */
public class SingletonType6 {
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


    /**
     * volatile 保证修改可见
     */
    private volatile static Singleton INSTANCE;

    public static Singleton getInstance() {
        if (INSTANCE == null){
            synchronized (Singleton.class){
                //当多线程进入时 在进行一次判断 解决同步问题
                if (INSTANCE == null){
                INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }


}
