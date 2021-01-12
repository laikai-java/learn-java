package com.lk.designpattern.principle.dependency;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 依赖倒置 原则  面向接口编程
 * @Date 2020/12/29 14:50
 */
public class Dependency {

  public static void main(String[] args) {
    //考虑ITv怎么注入进openAndClose中
    ITv aqiyi = new Aqiyi();
    openAndClose openAndClose = new openAndClose();
    //1使用接口注入
    openAndClose.open(aqiyi);

    //2使用构造器
    openAndClose2 openAndClose2 = new openAndClose2(aqiyi);
    openAndClose2.open();

    //使用setter注入
    openAndClose3 openAndClose3 = new openAndClose3();
    openAndClose3.setTv(aqiyi);
    openAndClose3.open();
  }
}

interface ITv {
  void play();
}

interface IOpenAndClose {
  void open(ITv tv);
}

interface IOpenAndClose2 {
  void open();
}

class openAndClose implements IOpenAndClose {

  public void open(ITv tv) {
    System.out.println("--------------------使用接口注入-------------------------");
    tv.play();
  }
}

class openAndClose2 implements IOpenAndClose2 {
  ITv tv;
  public openAndClose2(ITv tv) {
    this.tv = tv;
  }

  public void open() {
    System.out.println("--------------------使用构造器注入-------------------------");
    tv.play();
  }
}

class openAndClose3 implements IOpenAndClose2 {
  ITv tv;
  public void setTv(ITv tv) {
    this.tv = tv;
  }

  public void open() {
    System.out.println("--------------------使用setter注入-------------------------");
    tv.play();
  }
}


class Aqiyi implements ITv {
  public void play() {
    System.out.println("爱奇艺播放");
  }
}


