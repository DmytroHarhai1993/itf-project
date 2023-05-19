package com.example.ppj07;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the mileage of the distance for a calculate gallon's value ");
         session();
    }
    public static void session(){
        final double gallon = 3.7;
        final String formatUS = "gallon's value by miles ever";
        final String formatEU = "gallon's value by kilometres ever";
        System.out.println("Enter the number of the distance: ");
        int user1 = new Scanner(System.in).nextInt();
        System.out.println("Enter the format variable: ");
        String user2 = new Scanner(System.in).nextLine();
        if(Objects.equals(user2, "km")){
            System.out.println(gallon/100 * user1 + "  " +  formatEU);
        }else if(Objects.equals(user2,"ml")){
            System.out.println((gallon/100 * user1) * 1.6  + "  " + formatUS);
        }else{
            System.out.println("Error");
        }
    }
}