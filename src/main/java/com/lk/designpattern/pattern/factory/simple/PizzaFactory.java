package com.lk.designpattern.pattern.factory.simple;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 披萨工厂  创建具体的披萨
 * @Date 2021/1/12 09:55
 */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "chesse":
                pizza = new ChessePizza();
                break;
            case "claim":
                pizza = new ClaimPizza();
                break;
            default:
                pizza = new DefaultPizza();
        }
        return pizza;
    }
}
