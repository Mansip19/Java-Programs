package com.classdemo;

class X
{
    protected int i = 1221;
     
    void methodOfX()
    {
        System.out.println(i);
    }
}
 
public class MainClass1
{
    public static void main(String[] args)
    {
        X x = new X();
         
        System.out.println(x.i);
         
        x.methodOfX();
    }
}

