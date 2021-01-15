package com.lk.designpattern.pattern.facade;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 外观类
 * @Date 2021/1/15 14:10
 */
public class ComputerFacade {
    private Computer cpu;
    private Computer ddr;
    private Computer ssd;

    public void onCpu(){
        cpu = new Cpu();
        cpu.open();
    }

    public void onDdr(){
        ddr = new Ddr();
        ddr.open();
    }
    public void onSsd(){
        ssd = new Ssd();
        ssd.open();
    }

    public void onComputer(){
        cpu = new Cpu();
        cpu.open();
        ddr = new Ddr();
        ddr.open();
        ssd = new Ssd();
        ssd.open();
    }



}
