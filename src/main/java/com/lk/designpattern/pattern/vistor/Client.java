package com.lk.designpattern.pattern.vistor;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/19 10:25
 */
public class Client {
    public static void main(String[] args) {
        Presciption presciption = new Presciption();
        MedicineA medicineA = new MedicineA("a药",200);
        MedicineB medicineB = new MedicineB("b药",300);
        presciption.addMedicine(medicineA);
        presciption.addMedicine(medicineB);

        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("赖凯");
        presciption.accept(workerOfPharmacy);

        Visitor charger = new Charger();
        charger.setName("lcp");
        presciption.accept(charger);
    }
}
