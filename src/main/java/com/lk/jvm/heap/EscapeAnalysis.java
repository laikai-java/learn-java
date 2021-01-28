package com.lk.jvm.heap;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 逃逸分析
 * 一个对象并没有逃逸出方法的话，那么就可能被优化成栈上分配
 * 如何快速的判断是否发生了逃逸分析，大家就看new的对象实体是否在方法外被调用。
 * @Date 2021/1/25 09:52
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    /**
     * 方法返回EscapeAnalysis对象，发生逃逸
     * @return
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis():obj;
    }

    /**
     * 为成员属性赋值，发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    /**
     * 对象的作用于仅在当前方法中有效，没有发生逃逸
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /**
     * 引用成员变量的值，发生逃逸
     */
    public void useEscapeAnalysis2() {
        EscapeAnalysis e = getInstance();
        // getInstance().XXX  发生逃逸
    }
}
