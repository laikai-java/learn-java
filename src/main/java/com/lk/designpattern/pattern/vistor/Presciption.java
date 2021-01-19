package com.lk.designpattern.pattern.vistor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 药房  对象结构
 * @Date 2021/1/19 10:24
 */
public class Presciption {
    List<Medicine> list = new ArrayList<Medicine>();

    public void accept(Visitor visitor){
        Iterator<Medicine> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine){
        list.add(medicine);
    }

    public void removeMedicien(Medicine medicine){
        list.remove(medicine);
    }
}
