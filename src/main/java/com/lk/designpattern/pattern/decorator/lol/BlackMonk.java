package com.lk.designpattern.pattern.decorator.lol;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 盲僧 ConcreteComponent
 * @Date 2021/1/14 16:53
 */
public class BlackMonk implements Hero{

    private String name;

    public BlackMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能");
    }
}
