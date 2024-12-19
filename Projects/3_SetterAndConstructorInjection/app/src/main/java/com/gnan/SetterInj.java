package com.gnan;

public class SetterInj
{
    int put=1;
    int no;
    private int num;

    private String name;

    private int number;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setin()
    {
        System.out.println("This is Setter Injection.");
    }

   

    
}
