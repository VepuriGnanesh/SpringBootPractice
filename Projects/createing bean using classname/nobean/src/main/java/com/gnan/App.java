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
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        // FirstClass obj2=(FirstClass)context.getBean("bean3");//search by type(1)
        //in spring.xml in container spring is creating a bean3 and bean3 is assigned to obj2
        //& we have to typecast it (firstClass) & calling that bean3 as getBean -search by type

        FirstClass obj2=context.getBean(FirstClass.class);//search by name(2)
        //in spring.xml in container spring is creating a bean3 and bean3 is assigned to obj2
        //&no need of typecasting of classname but we are calling class name here

        obj2.run();
        System.out.println( "Hello World!" );
        ((ClassPathXmlApplicationContext)context).close();
    }
}
