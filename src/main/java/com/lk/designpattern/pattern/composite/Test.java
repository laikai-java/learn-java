package com.lk.designpattern.pattern.composite;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/15 13:59
 */
public class Test {
    public static void main(String[] args) {
        Folder c = new Folder("c盘");
        File mp3 = new Mp3File("c/x.MP3");
        File txt = new TextFile("c/x.txt");
        c.add(mp3);
        c.add(txt);
        c.display();

        Folder c_a = new Folder("c/a");
        File a_mp3 = new Mp3File("c/a/x.MP3");
        File a_txt = new TextFile("c/a/x.txt");
        c_a.add(a_mp3);
        c_a.add(a_txt);
        c.add(c_a);
        c.display();
    }
}

