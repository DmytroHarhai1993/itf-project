package com.example.ppj05;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(task1(122, 114, 125));
        System.out.println(" ");
        System.out.println(task2(10,100,100,100));

    }

    public static int task1(int a, int b, int c) {
        System.out.println("Create the programme which search for a middle of the three values" +
                "\n" + "The Middle of The values is: ");

        int middleNum = 0;
        boolean a1 = (b >= a && a >= c) || (c >= a && a >= b);
        boolean b1 = (a >= b && b >= c) || (c >= b && b >= a);
        boolean c1 = (a >= c && c >= b) || (b >= c && c >= a);
        if (a1) {
            middleNum = a;
        } else if (b1) {
            middleNum = b;
        } else if (c1) {
            middleNum = c;
        }
        return middleNum;
    }

    public static int task2(int a, int b, int c, int d) {
        System.out.println("Create a programme which search for a differense beetween smallest" +
                " and biggest integers");
        System.out.println("The difference beetween biggest and smallest is: ");
        int max = 0;
        int min = 0;
        if(a > b && a > c && a > d) {
            max = a;
        } else if(b > a && b > c && b > d){
            max = b;
        }else if(c > d){
            max = c;
        }else{
            max = d;
        }
        if(a < b && a < c && a < d) {
            min = a;
        } else if(b < a && b < c && b < d){
            min = b;
        }else if(c < d){
            min = c;
        }else{
            min = d;
        }
        return max - min;
      }
    }


