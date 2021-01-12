package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 抽象工厂：披萨总店
 * @Date 2021/1/12 10:31
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
