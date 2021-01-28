package com.lk.jvm.heap;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 标量替换 -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 * @Date 2021/1/25 14:11
 */
public class scalar {
    public static void main(String args[]) {
        alloc();
    }

    private static void alloc() {
        Point point = new Point(1,2);
        System.out.println("point.x" + point.x + ";point.y" + point.y);
    }
}
class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
