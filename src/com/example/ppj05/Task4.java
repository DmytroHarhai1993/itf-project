package com.example.ppj05;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.print("Enter three boolean " +
                    "values (true or false) ");
            boolean a = sca.nextBoolean();
            boolean b = sca.nextBoolean();
            boolean c = sca.nextBoolean();

            boolean allThree = a && b && c;
            boolean exactlyOne = (a && !b && !c) || (b && !c && !a) || (c && !a && !b);
            boolean exactlyOne3 = (a ^ b && !c) || (!a && b ^ c);
            boolean exactlyOne2 = (a ^ b ^ c) && !allThree;
            boolean exactlyTwo = (a && b && !c) || (b && c && !a) || (a && c && !b);
            boolean exactlyTwo1 = (a ^ b && c) || (a && b ^ c);
            boolean atLeastOne = a || b || c;
            boolean atLeastTwo = (a && b) || (a && c) || (b && c);

            System.out.println("a, b, c = " + a + ", " + b +
                    ", " + c + "\nallThree:   " + allThree +
                    "\nexactlyOne: " + exactlyOne +
                    "\nexactlyTwo: " + exactlyTwo +
                    "\natLeastOne: " + atLeastOne +
                    "\natLeastTwo: " + atLeastTwo);
        }
    }
}