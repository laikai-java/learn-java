package com.lk.designpattern.pattern.adapter.type3;




/**
 * @Author laikai
 * @Version 1.0
 * @Description 测试接口适配 器
 * @Date 2021/1/13 14:13
 */
public class Test {
    public static void main(String[] args) {
        int i = new Power5VAdapter(new Voltage220v()).output5V();
        System.out.println(i);

        PowerAdapter powerAdapter = new PowerAdapter(new Voltage220v()) {
            @Override
            public int output24V() {
                return voltage220v.output220v()/10;
            }
        };
        int i1 = powerAdapter.output24V();
        System.out.println(i1);

    }
}
