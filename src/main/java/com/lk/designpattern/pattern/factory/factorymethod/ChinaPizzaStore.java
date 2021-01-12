package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体工厂。披萨分店。 中国分店 对象的创建交给子类实现
 * @Date 2021/1/12 10:35
 */
public class ChinaPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        switch (type){
            case "chesse":
                pizza = new ChinaCheesePizza();
                break;
            case "clian":
                pizza = new ChinaCheesePizza();
                break;
            default:
                pizza = new DefaultPizza();
                break;
        }
        return pizza;
    }
}
