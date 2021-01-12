package com.lk.designpattern.pattern.factory.factorymethod;

/**
 * @Author laikai
 * @Version 1.0
 * @Description
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式让实例化推迟到子类。
 * 测试工厂方法模式,后续想要添加不同地区的披萨店  只需要添加具体的产品和具体的creator即可
 * 在工厂方法模式中，我们使用一个工厂创建一个产品，也就是说一个具体的工厂对应一个具体的产品。
 *  符合ocp原则
 * @Date 2021/1/12 10:41
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //想吃中国的披萨
        ChinaPizzaStore chinaPizzaStore = new ChinaPizzaStore();
        //订一份cheese披萨
        Pizza pizza = chinaPizzaStore.orderPizza("chesse");
        System.out.println("订一份中国的cheese : " + pizza.getName());
    }
}
