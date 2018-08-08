package net.merchante.test;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

    private String brand;

    // TODO: is this one of the 3 ways we discussed in 2 Aug meeting
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
//        return "Tyre{" +
//                "brand='" + brand + '\'' +
//                '}';

        return "It's working";
    }
    // Constructor - value added using constructor-arg in xml
    /*public Tyre(String brand) {
        this.brand = brand;
    }*/
}
