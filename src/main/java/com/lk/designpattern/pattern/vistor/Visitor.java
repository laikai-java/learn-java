package com.lk.designpattern.pattern.vistor;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 抽象访问者 为element中的每个类 声明一个操作
 * @Date 2021/1/19 10:13
 */
public abstract class Visitor {

    protected  String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void vistor(MedicineA medicineA);

    public abstract void vistor(MedicineB medicineB);




}
