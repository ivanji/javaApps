package com.navin.Telusko.Alien;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
// Lesson on Aspect Oriented Programming (AOP)

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {


    @Before("execution(public void show())")
    public void log() {
        System.out.println("Show Called");
    }

}
