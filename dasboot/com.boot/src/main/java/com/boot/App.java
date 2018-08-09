package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO: Deployment of Static Resources to web server
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
