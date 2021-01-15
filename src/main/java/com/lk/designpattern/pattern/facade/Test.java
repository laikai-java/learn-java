package com.lk.designpattern.pattern.facade;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 14:13
 */
public class Test {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.onCpu();
        facade.onComputer();
    }
}
