package com.lk.designpattern.pattern.decorator.lol;

/**
 * @Author laikai
 * @Version 1.0
 * @Description E技能
 * @Date 2021/1/14 16:57
 */
public class Skill_E extends Skills{
    private String skillName;

    public Skill_E(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }


    @Override
    public void learnSkills() {
        System.out.println("学习了技能E : " + skillName);
        super.learnSkills();
    }
}
