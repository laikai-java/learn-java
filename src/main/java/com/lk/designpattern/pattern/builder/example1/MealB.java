package com.lk.designpattern.pattern.builder.example1;

import lombok.ToString;

/**
 * @Author laikai
 * @Version 1.0
 * @Description ConcreteBuilder  具体建造者。实现抽象接口，构建和装配各个部件。​
 * @Date 2021/1/13 09:31
 */
public class MealB extends MealBulider {

    @Override
    public void buildFood() {
        meal.setFood("套餐B的food");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("套餐B的drink");
    }
}
