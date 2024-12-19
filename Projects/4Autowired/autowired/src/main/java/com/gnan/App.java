package com.gnan;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Autowired obj2=(Autowired)context.getBean("Autobean");
        obj2.build();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
