package com.lk.designpattern.pattern.command;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 遥控器  调用者  如果支持撤销操作
 * @Date 2021/1/19 09:48
 */
public class Controller {
    Command tvOnCommand;
    Command tvColseCommand;
    Command tvChangeCommand;

    //撤销操作 添加频道
    //当前频道
    public int nowChannel = 0;

    //前一个频道，用于执行返回操作
    public int priorChannel;

    public Controller(Command tvOnCommand, Command tvColseCommand, Command tvChangeCommand) {
        this.tvOnCommand = tvOnCommand;
        this.tvColseCommand = tvColseCommand;
        this.tvChangeCommand = tvChangeCommand;
    }

    public void open(){
        tvOnCommand.execute();
    }

    public void close(){
        tvColseCommand.execute();
    }

    public void change(){
        tvChangeCommand.execute();
    }


}
