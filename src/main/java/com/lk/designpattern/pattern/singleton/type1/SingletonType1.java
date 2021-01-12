package com.lk.designpattern.pattern.singleton.type1;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 饿汉式--静态常量
 * @Date 2021/1/11 14:39
 */
public class SingletonType1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10;i++){
            System.out.println("第" + i + "个");
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("当前线程"+Thread.currentThread().getName());
                    Singleton instance = Singleton.getInstance();
                    System.out.println( "实例地址:" + instance);
                }
            }).start();
        }
    }
}

class Singleton {

    /**
     * 构造器私有化
     */
    private Singleton() {
    }

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }


}
