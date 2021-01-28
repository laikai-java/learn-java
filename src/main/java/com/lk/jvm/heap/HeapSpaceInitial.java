package com.lk.jvm.heap;

/**
 * @Author laikai
 * @Version 1.0
 * @Description
 * -Xms 用来设置堆空间（年轻代+老年代）的初始内存大小
 *  *  -X：是jvm运行参数
 *  *  ms：memory start
 *  * -Xmx：用来设置堆空间（年轻代+老年代）的最大内存大小
 *  “-Xms"用于表示堆区的起始内存，等价于-xx:InitialHeapSize
 * “-Xmx"则用于表示堆区的最大内存，等价于-XX:MaxHeapSize
 * 通常会将-Xms和-Xmx两个参数配置相同 为了能够在ava垃圾回收机制清理完堆区后不需要重新分隔计算堆区的大小，从而提高性能
 * @Date 2021/1/23 10:48
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        // 返回Java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // 返回Java虚拟机试图使用的最大堆内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + initialMemory + "M");
        System.out.println("-Xmx:" + maxMemory + "M");
    }
}
