package com.lk.designpattern.pattern.vistor;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体元素
 * @Date 2021/1/19 10:16
 */
public class MedicineB extends Medicine {
    public MedicineB(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.vistor(this);
    }
}
