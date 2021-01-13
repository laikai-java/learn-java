package com.lk.designpattern.pattern.builder.example1;

/**
 * @Author laikai
 * @Version 1.0
 * @Description Director
 * @Date 2021/1/13 09:33
 */
public class KFCWaiter {

    MealBulider mealBulider;

    public void setMealBulider(MealBulider mealBulider) {
        this.mealBulider = mealBulider;
    }

    public Meal construct() {
        mealBulider.buildFood();
        mealBulider.buildDrink();
        return mealBulider.getMeal();
    }
}
