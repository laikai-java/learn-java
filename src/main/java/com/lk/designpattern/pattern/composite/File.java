package com.lk.designpattern.pattern.composite;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 13:53
 */
public abstract class File {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File(String name) {
        this.name = name;
    }

    abstract void display();
}
