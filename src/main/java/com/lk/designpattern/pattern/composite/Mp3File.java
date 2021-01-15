package com.lk.designpattern.pattern.composite;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 13:57
 */
public class Mp3File extends File{

    public Mp3File(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("这是MP3 名称为" + super.getName());
    }
}
