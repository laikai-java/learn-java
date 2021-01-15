package com.lk.designpattern.pattern.composite;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 13:57
 */
public class TextFile extends File{

    public TextFile(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("这是文本 名称为" + super.getName());
    }
}
