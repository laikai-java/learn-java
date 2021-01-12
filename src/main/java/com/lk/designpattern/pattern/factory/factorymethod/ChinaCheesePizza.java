package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 中国地区的披cheese披萨
 * @Date 2021/1/12 10:26
 */
public class ChinaCheesePizza extends Pizza {

    public ChinaCheesePizza() {
        name = "ChinaCheesePizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated China Cheese");
    }


    @Override
    public void bake() {
        System.out.println("ChinaCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChinaCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChinaCheesePizza box");
    }
}
