package com.gnani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        // Scope obj1=(Scope)context.getBean("bean1");
        // obj1.age=25;
        // obj1.setNum(999);
        // System.out.println(obj1.age);
        // System.out.println(obj1.getNum());

        // Scope obj2=(Scope)context.getBean("bean1");
        // obj2.run();
        // System.out.println(obj2.age+"\n"+obj2.getNum());

        System.out.println( "Hello World!" );
        ((ClassPathXmlApplicationContext)context).close();


    }
}
