package com.lk.designpattern.pattern.factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 披萨产品 抽象产品:现在需要添加不同地区的披萨店进行订购披萨
 * @Date 2021/1/12 09:50
 */
public abstract class Pizza {
    protected String name;        //名称
    protected String dough;       //面团
    protected String sause;       //酱料
    protected List<String> toppings = new ArrayList<String>();       //佐料


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sause");
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

    public String getName() {
        return name;
    }
}
