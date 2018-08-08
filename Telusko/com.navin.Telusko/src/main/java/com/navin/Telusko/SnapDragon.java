package com.navin.Telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("snapdragon")
public class SnapDragon implements MobileProcessor {

    public void process() {
        System.out.println("Snapdragon - World's best CPU");
    }
}
