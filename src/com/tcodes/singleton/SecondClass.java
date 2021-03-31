package com.tcodes.singleton;

public class SecondClass {
    String myString;


    private SecondClass(String newString)
    {
        myString = newString;
    }

    public static SecondClass initialize(String newString)
    {
        return new SecondClass(newString);
    }

    public void printString()
    {
        System.out.println(myString);
    }
}
