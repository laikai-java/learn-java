package com.lk.designpattern.pattern.templete;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/19 09:57
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}