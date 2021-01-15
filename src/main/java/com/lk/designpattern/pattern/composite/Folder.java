package com.lk.designpattern.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 目录
 * @Date 2021/1/15 13:54
 */
public class Folder extends File{
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    @Override
    void display() {
        System.out.println("这是" + super.getName() + "===========");
        files.forEach(File::display);
    }

    public void add(File file){
        files.add(file);
    }

    public void remove(File file){
        files.remove(file);
    }

}
