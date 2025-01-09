package com.gnan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        SetterInj obj2=(SetterInj) context.getBean("bean2");

        System.out.println(obj2.put);//calling the initialised var

        obj2.no=5;
        System.out.println(obj2.no);//assigning value to variable via the obj and printing it

        obj2.setNum(9);
        System.out.println(obj2.getNum());//assigning/setting a (int)val to the private var and calling/printing it

        obj2.setName("Gnaneshnadh");
        System.out.println(obj2.getName());//assigning/setting a (String)val to the private var and calling/printing it

        System.out.println(obj2.getNumber());
        //Spring is assigning a val to the private variable using property tag in spring.xml file

        obj2.setin();//calling the method using obj2

        ApplicationContext context2=new ClassPathXmlApplicationContext("spring.xml");

        ConstructorInj obj3=(ConstructorInj) context2.getBean("bean2.1");
        

        System.out.println(obj3.age1);

        ((ClassPathXmlApplicationContext) context).close();
        ((ClassPathXmlApplicationContext)context2).close();
    }
}
/*
1
5
9
Gnaneshnadh
10
This is Setter Injection.
1423
 */