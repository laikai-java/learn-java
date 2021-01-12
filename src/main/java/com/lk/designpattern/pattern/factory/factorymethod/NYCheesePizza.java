package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description ny地区的cheese披萨
 * @Date 2021/1/12 10:26
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NYCheesePizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated ny Cheese");
    }


    @Override
    public void bake() {
        System.out.println("NYCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYCheesePizza box");
    }
}
