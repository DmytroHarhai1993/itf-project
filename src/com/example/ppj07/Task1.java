package com.example.ppj07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1V1();
        task1V2();
    }

    public static void task1V1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c < a && c < b) {
            System.out.println(a + " " + b);
        } else if (b < a && b < c) {
            System.out.println(a + " " + c);
        } else {
            System.out.println(b + " " + c);
        }
    }

    public static void task1V2() {
        Scanner scanner = new Scanner(System.in);
        int max1 = scanner.nextInt();
        int max2 = scanner.nextInt();
        int temp = scanner.nextInt();
        if (temp >= max1) {
            max1 = temp;
        } else if (temp >= max2) {
            max2 = temp;
        }
        System.out.println(max1 + " " + max2);
    }
}