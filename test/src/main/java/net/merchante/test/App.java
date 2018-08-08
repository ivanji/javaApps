package net.merchante.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )
    {

        // TODO: Review dependency injection

        //        Bike obj = new Bike();

        /*
        *
        * In order to be able to replace this object with a different class, we use dependency injection.
        * Where we instead specify the type of object in a different manner.
        *
        * There are multiple ways of accomplishing dependency injection.
        * */


        // Method 1: Small app - use Bean factory. Larger apps should use Application context interface.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle) context.getBean("car"); // this requires a reference found within an xml file.

        // Method 2: Annotation based
        // using @Component and some config in spring.xml

        // Method 3: JAVA Config

        obj.drive();

        /*Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);*/
    }
}
