package com.lk.map;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2020/11/24 11:44
 */
public class MapTest {

    @Test
    public void testMap() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hollis", "hollischuang");
        Class<?> mapType = map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        Object invoke = capacity.invoke(map);
        System.out.println(invoke);
    }
}
