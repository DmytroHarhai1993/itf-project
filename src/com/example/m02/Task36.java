package com.example.m02;

public class Task36 {
    public static void main(String[] args) {
        System.out.println(changeMoneyAmount(10.5f, 40));
        System.out.println(calculateMoneySum(1, 101));
        System.out.println(halfOfMoney(44.5));
    }

    public static int changeMoneyAmount(float startAmount, float reMove) {
        return (int) (startAmount - reMove);
    }

    public static byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public static short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }
}











