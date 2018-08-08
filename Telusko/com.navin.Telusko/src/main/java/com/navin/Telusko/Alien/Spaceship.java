package com.navin.Telusko.Alien;

import com.navin.Telusko.Alien.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spaceship {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien a1 = context.getBean(Alien.class);

        a1.show();

    }

}
