package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random rand = new Random();
        int int_random;
        do
            int_random = rand.nextInt(13);
        while(int_random == 0);


        int month = int_random;

        if (month == 12 || month <= 2) {
            System.out.println("Зима_" + int_random);
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна_" + int_random);
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето_" + int_random);
        } else {
            System.out.println("Осень_" + int_random);
        }



        switch (int_random) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима" + " " + int_random);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна" + " " + int_random);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето" + " " + int_random);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень" + " " + int_random);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + int_random);
        }



        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int a = mass.length-1; a >= 0; a--) {

            System.out.print(mass[a]+ " ");
        }

        System.out.println();

        int[][] squareArray = {{11,12,13},{14,15,16}};

        for (int i = 0; i < squareArray.length; i++) {
            for (int j=0; j<squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "[" + i + "][" + j + "] ");
            }
            System.out.println();
        }




    }

}
