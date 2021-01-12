package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 中国地区的Clain披萨
 * @Date 2021/1/12 10:26
 */
public class ChinaClainPizza extends Pizza {

    public ChinaClainPizza() {
        name = "ChinaClainPizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated China Clain");
    }


    @Override
    public void bake() {
        System.out.println("ChinaClainPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChinaClainPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChinaClainPizza box");
    }
}
