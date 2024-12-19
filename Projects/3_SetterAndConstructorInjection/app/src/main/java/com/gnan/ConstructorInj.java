package com.gnan;

public class ConstructorInj{

    int age1;
   

    public ConstructorInj()//Constructor will be called first and other mtds next in this class
    {
        System.out.println("constructor called");
    }

    public ConstructorInj(int age1) {
        this.age1 = age1;
    }
}
