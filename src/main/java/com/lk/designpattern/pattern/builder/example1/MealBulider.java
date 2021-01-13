package com.lk.designpattern.pattern.builder.example1;

/**
 * @Author laikai
 * @Version 1.0
 * @Description Builder 抽象层
 * @Date 2021/1/13 09:20
 */
public abstract class MealBulider {

    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }


}
