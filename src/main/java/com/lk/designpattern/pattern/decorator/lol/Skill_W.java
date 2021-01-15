package com.lk.designpattern.pattern.decorator.lol;

/**
 * @Author laikai
 * @Version 1.0
 * @Description W技能
 * @Date 2021/1/14 16:57
 */
public class Skill_W extends Skills{
    private String skillName;

    public Skill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }


    @Override
    public void learnSkills() {
        System.out.println("学习了技能W : " + skillName);
        super.learnSkills();
    }
}
