package com.lk.designpattern.pattern.vistor;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 具体的访问者
 * @Date 2021/1/19 10:20
 */
public class WorkerOfPharmacy extends Visitor {


    @Override
    public void vistor(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    @Override
    public void vistor(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
}
