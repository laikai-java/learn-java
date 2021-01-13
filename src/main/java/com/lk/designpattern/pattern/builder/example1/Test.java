package com.lk.designpattern.pattern.builder.example1;

import com.lk.designpattern.pattern.builder.example2.NewComputer;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/13 09:36
 */
public class Test {
    public static void main(String[] args) {
        MealBulider mealBulider = new MealB();
        KFCWaiter kFCWaiter = new KFCWaiter();
        kFCWaiter.setMealBulider(mealBulider);
        Meal construct = kFCWaiter.construct();
        System.out.println(construct.getFood());
        System.out.println(construct.getDrink());


    }
}
