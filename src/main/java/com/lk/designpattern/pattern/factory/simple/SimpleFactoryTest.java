package com.lk.designpattern.pattern.factory.simple;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 简单工厂也叫静态工厂   由一个产品的抽象类 和 具体产品  以及 一个创建具体产品的工厂类组成
 *   但是不符合开闭原则  当需要增加某种产品时  会对工厂类进行修改
 *   简单工厂模式最大的优点在于实现对象的创建和对象的使用分离，但是如果产品过多时，会导致工厂代码非常复杂。
 * @Date 2021/1/12 09:59
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //此处相当于一个披萨店进行一次pizza的订购流程
        Pizza pizza = PizzaFactory.createPizza("chesse");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
