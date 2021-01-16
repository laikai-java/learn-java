package com.lk.designpattern.pattern.proxy.staticproxy;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 静态代理类 实现与目标对象相同的接口,并持有目标对象实例
 * @Date 2021/1/15 16:15
 */
public class TeacherDaoProxy implements  IteacherDao{

    private IteacherDao teacherDao;

    public TeacherDaoProxy(IteacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("静态代理前的操作");
        teacherDao.teach();
        System.out.println("静态代理后的操作");
    }
}
