package com.lk.designpattern.pattern.command;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/19 09:43
 */
public class TVColseCommand implements Command {
    Television television;

    public TVColseCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.close();
    }
    
}
