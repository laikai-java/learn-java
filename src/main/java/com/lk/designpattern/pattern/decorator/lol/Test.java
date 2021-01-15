package com.lk.designpattern.pattern.decorator.lol;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/14 17:02
 */
public class Test {
    public static void main(String[] args) {
        //选择英雄
        Hero hero = new BlackMonk("李青");

        Skills skills = new Skills(hero);
        Skills r = new Skill_R(skills,"猛龙摆尾");
        Skills e = new Skill_E(r,"天雷破/摧筋断骨");
        Skills w = new Skill_W(e,"金钟罩/铁布衫");
        Skills q = new Skill_Q(w,"天音波/回音击");
        //学习技能
        q.learnSkills();
        System.out.println( Integer.valueOf(199) ==  Integer.valueOf(199));

    }
}
