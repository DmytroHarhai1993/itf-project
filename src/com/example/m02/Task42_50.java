package com.example.m02;

public class Task42_50 {
    public static void main(String[] args) {
      System.out.println("\n" + "Порожність строки: TASK 42");
        System.out.println(isInvisibleName(""));
        System.out.println(isInvisibleName("\n"));
        System.out.println(isInvisibleName("\nAwesome"));
        System.out.println("\n" + "Чесне ім'я: TASK 43");
        System.out.println(makeNameClean("Cargo"));
        System.out.println("TASK 45. Half of name");
        System.out.println(halfOfName("Marian"));
        System.out.println(halfOfName("Lopez"));


    }
    public static boolean isInvisibleName(String name){
        boolean a = name.isEmpty();
        boolean b = name.isBlank();
        boolean c = name.length() >=1;
        boolean trueName = a && b;
        return trueName;
    }
    public static String makeNameClean(String name){
        String toClean = "CLEAN";
        return toClean + name + toClean;

    }
    public static String halfOfName(String name){
     int nameLength = (name.length() + 1);
     int halfOfName = nameLength/2;
     return name.substring(0,halfOfName);
         }
     }
















