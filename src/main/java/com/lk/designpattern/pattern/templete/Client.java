package com.lk.designpattern.pattern.templete;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/19 09:58
 */
public class Client {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();
        Game cricket = new  Cricket();
        cricket.play();
    }
}
