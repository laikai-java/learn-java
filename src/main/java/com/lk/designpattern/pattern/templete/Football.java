package com.lk.designpattern.pattern.templete;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/19 09:57
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
