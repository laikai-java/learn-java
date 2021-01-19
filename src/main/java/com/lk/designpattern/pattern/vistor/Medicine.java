package com.lk.designpattern.pattern.vistor;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 抽象元素
 * @Date 2021/1/19 10:14
 */
public abstract class Medicine {

    protected String name;
    protected double price;

    public abstract void accept(Visitor visitor);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Medicine (String name,double price){
        this.name = name;
        this.price = price;
    }


}

