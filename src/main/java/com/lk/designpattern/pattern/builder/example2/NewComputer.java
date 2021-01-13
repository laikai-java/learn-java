package com.lk.designpattern.pattern.builder.example2;

import com.sun.org.apache.regexp.internal.RE;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author laikai
 * @Version 1.0
 * @Description TODO
 * @Date 2021/1/13 09:40
 */
@Data
@AllArgsConstructor
public class NewComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;


    public static Builder Builder(){
        return new Builder();
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder mainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public NewComputer build() {
            return new NewComputer(cpu, screen, memory, mainboard);
        }


    }
}
