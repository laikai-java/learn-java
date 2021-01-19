package com.lk.designpattern.pattern.templete;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/19 09:57
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
