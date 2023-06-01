package com.example.ppj11;

public class Task1 {
    public static void main(String[] args) {
        int certCount = 1000;
        int winnersRate = 100;
        boolean[] certIsWin = new boolean[certCount];
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1000000 + (int)Math.round(8999999 * Math.random());
            certIsWin[i] = i % winnersRate == 0;
        }
        for (int i = 0; i < certNumbers.length; i++) {
            System.out.println(certNumbers[i]);
        }
        int[] winnerNumbers = new int [certNumbers.length/winnersRate];

        int winnerNumbersIndex = 0;
        for(int i = 0; i < certNumbers.length; i = i + winnersRate){
            winnerNumbers[winnerNumbersIndex ++ ] = certNumbers[i];
        }

    }
}