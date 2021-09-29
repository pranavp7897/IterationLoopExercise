package com.perscholas.java_basics;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //slide 24
    /*
        Random r = new Random();
        int low = 0;
        int high = 100;
        int random = r.nextInt(high-low) + low;

        System.out.println("Enter a number between 0 & 100: ");
        int userNum = input.nextInt();

        if (userNum > random) {
            System.out.println("Input is too high! Try again.");
        } else if (userNum < random) {
            System.out.println("Input is too low! Try again.");
        } else {
            System.out.println("Congrats!! You got it right!");
        }*/

        //slide 51
       /* for (int i=1;i<=12;i++){
            for (int j=1;j<=12;j++)
                System.out.print("\t"+i*j);
            System.out.println();
        }*/

        //slide 53
        /*double tuition = 10000;
        int year = 0;
        while (tuition <= 20000) {
            tuition = tuition * 1.07;
            year++;
            System.out.println(year);
        }*/

    /*
    Write a program that prints the Fibonacci Sequence from 0 to 50.
    The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
     */
        /*
        int x = 10;

        int count = 0;
        int numOne = 0;
        int numTwo = 1;

        while (count < x) {
            System.out.print(numOne + " ");
            int numThree = numOne + numTwo;
            numOne = numTwo;
            numTwo = numThree;
            count++;
        }*/
    /*
    Write a program that returns all the available palindromes within 10 and 200.
    The following output will be produced:11, 22, 33, 44, 55, 66, 77, 88, 99, 101,
     111, 121, 131, 141, 151, 161, 171, 181, 191,
    */
        for (int num = 10; num < 200; num++) {
            String number = String.valueOf(num);
            if (number.length() == 2) {
                if (number.charAt(0) == number.charAt(1)) {
                    System.out.print(number + " ");
                }
            } else if (number.length() == 3) {
                if (number.charAt(0) == number.charAt(2)) {
                    System.out.print(number + " ");
                }
            }
        }

    }//end main
}//end class


