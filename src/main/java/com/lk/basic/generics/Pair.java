package com.lk.basic.generics;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/2/5 11:30
 */
public class Pair<T> {

    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T  value) {
        this.value = value;
    }

    public <T> T add(T x,T y){
        return y;
    }
}
