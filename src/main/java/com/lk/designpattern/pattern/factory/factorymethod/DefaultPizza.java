package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 默认的披萨
 * @Date 2021/1/12 10:26
 */
public class DefaultPizza extends Pizza {

    public DefaultPizza() {
        name = "DefaultPizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated  DefaultPizza");
    }


    @Override
    public void bake() {
        System.out.println("DefaultPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("DefaultPizza cut");
    }

    @Override
    public void box() {
        System.out.println("DefaultPizza box");
    }
}
