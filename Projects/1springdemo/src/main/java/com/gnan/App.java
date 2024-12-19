package com.gnan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Computer obj=(Computer)context.getBean("com");
        obj.run();
        System.out.println("SpringBoot is running");
        ((ClassPathXmlApplicationContext)context).close();

    }
}
