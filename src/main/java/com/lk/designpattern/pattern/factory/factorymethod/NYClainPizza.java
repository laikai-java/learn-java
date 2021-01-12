package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 中国地区的Clain披萨
 * @Date 2021/1/12 10:26
 */
public class NYClainPizza extends Pizza {

    public NYClainPizza() {
        name = "NYClainPizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated ny Clain");
    }


    @Override
    public void bake() {
        System.out.println("NYClainPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYClainPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYClainPizza box");
    }
}
