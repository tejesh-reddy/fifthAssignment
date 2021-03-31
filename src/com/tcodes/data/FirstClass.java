package com.tcodes.data;

public class FirstClass {

    private int intVar;
    private char charVar;

    public FirstClass()
    {
    }

    public void printMemberVars()
    {
        System.out.println("integer: " + intVar + "\nString: " + charVar);
    }

    public void printLocalVars()
    {
        int varInt;
        int varChar;

        System.out.println("This can't be done");
        /*
        This is the part that isn't possible in java as all local variables must be assigned some value
        before they're used.

        System.out.println(varInt);
        System.out.println(varChar);
         */
    }
}
