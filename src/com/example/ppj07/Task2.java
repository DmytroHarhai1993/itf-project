package com.example.ppj07;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);
        System.out.println("The sum of the three last numbers is: " + (a + b + c));
    }
}