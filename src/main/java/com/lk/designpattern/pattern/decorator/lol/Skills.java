package com.lk.designpattern.pattern.decorator.lol;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 技能栏 相当于装饰器 Decorator
 * @Date 2021/1/14 16:55
 */
public class Skills implements Hero{
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        hero.learnSkills();
    }
}
