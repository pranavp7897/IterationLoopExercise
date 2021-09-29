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
    /*    for (int num = 10; num < 200; num++) {
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
      /*  Write a program that uses nested for-loops to output the following:Week 1:
Day 1
Day 2
Day 3
Day 4
Day 5
*/
/*
        int weeks = 2, days_in_week = 5;

        for (int i = 1; i <= weeks; ++i) {

            System.out.println("Week: " + i);

            for (int j = 1; j <= days_in_week; ++j) {

                System.out.println("Day: " + j);
            }
        }*/
       /* Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5,
                but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.
*/
     /*   int max = 100;

        for(int i =1; i <= max; i++)
        {
            if(i % 5 == 0)
            {
                System.out.println(i);
            }
            else if (i > 50)
                break;
        }*/

/*        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5,
                but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.*/
        /*int max = 100;

        for(int i =1; i <= max; i++)
        {
            if(i % 5 == 0)
            {
                if (i > 25 && i < 75)
                    continue;
                System.out.println(i);
            }

        }*/
        //Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
/*
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i <=10);*/

      //Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.

       /* int i =0;
        while (i <=100)
        {
            System.out.println(i);
            i = i + 10;
        }*/

        /*//Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.

        for(int i =1; i <=10; i++)
        {
            System.out.println(i);
        }*/
    }//end main
}//end class


