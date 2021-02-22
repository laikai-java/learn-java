package com.lk.basic.generics;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author laikai
 * @Version 1.0
 * @Description 泛型测试
 * @Date 2021/2/5 10:39
 */
public class GenericsTest {


    /**
     * Java类型的类型擦除 通过反射添加不属于该泛型的数据
     */
    @Test
    public void test1() throws Exception {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.getClass().getMethod("add", Object.class).invoke(stringList,123);;
        for(int i = 0; i < stringList.size(); i++){
            //System.out.println(stringList.get(i));
        }


        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.getClass().getMethod("add",Object.class).invoke(intList,"abc");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        System.out.println(stringList.getClass() == intList.getClass());
    }




}
