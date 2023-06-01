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
        int distanceNumb = new Scanner(System.in).nextInt();
        System.out.println("Enter the format variable: ");
        String distanceType = new Scanner(System.in).nextLine();
        if(Objects.equals(distanceType, "km")){
            System.out.println(gallon/100 * distanceNumb + "  " +  formatEU);
        }else if(Objects.equals(distanceType,"ml")){
            System.out.println((gallon/100 * distanceNumb) * 1.6  + "  " + formatUS);
        }else{
            System.out.println("Error");
        }
    }
}