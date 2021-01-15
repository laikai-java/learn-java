package com.lk.designpattern.pattern.decorator.lol;

/**
 * @Author laikai
 * @Version 1.0
 * @Description q技能
 * @Date 2021/1/14 16:57
 */
public class Skill_Q extends Skills{
    private String skillName;

    public Skill_Q(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }


    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q : " + skillName);
        super.learnSkills();
    }
}
