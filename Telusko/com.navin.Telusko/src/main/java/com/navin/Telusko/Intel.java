package com.navin.Telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Intel implements MobileProcessor {

    public void process() {
        System.out.println("Intel - the most popular CPU");
    }
}
