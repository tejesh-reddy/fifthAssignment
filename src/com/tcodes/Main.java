package com.tcodes;

import com.tcodes.data.FirstClass;
import com.tcodes.singleton.SecondClass;

public class Main {

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.printMemberVars();
        firstClass.printLocalVars();
        System.out.println();

        SecondClass secondClass = SecondClass.initialize("Singleton");
        secondClass.printString();
    }
}
