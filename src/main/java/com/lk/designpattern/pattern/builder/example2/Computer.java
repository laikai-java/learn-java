package com.lk.designpattern.pattern.builder.example2;

import lombok.Builder;
import lombok.Data;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/13 09:40
 */
@Builder
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
}
