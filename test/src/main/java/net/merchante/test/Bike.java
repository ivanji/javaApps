package net.merchante.test;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    public void drive() { // for example purposes let's say a car 'drives'
        System.out.println("Bike is riding...");
    }

}
