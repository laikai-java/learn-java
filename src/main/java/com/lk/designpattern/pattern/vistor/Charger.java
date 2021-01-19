package com.lk.designpattern.pattern.vistor;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体的访问者
 * @Date 2021/1/19 10:20
 */
public class Charger extends Visitor {


    @Override
    public void vistor(MedicineA a) {
        System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }

    @Override
    public void vistor(MedicineB b) {
        System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }
}
