package com.company;

import java.util.Scanner;

public class Task2 {

    int input, counter, sum;
    int minNum = 0;
    int maxNum = 0;

    public void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number, or put 0 if you want to end.");
        input = scanner.nextInt();

        while (input != 0){
            if (input > maxNum) {
                maxNum = input;
            } else if (input < minNum){
                minNum = input;
            }
            counter = counter + 1;
            sum = sum + input;
            input = scanner.nextInt();
        }

        System.out.println("Sum of inputted the largest and smallest number is: " + (minNum + maxNum));
        System.out.println("Arithmetic average of given numbers is: " + (double) (sum/counter));

    }

}

//Write a program that retrieves integers from the user. Receiving data ends with the number 0 (not included in the data).
//Then, the program calculates the sum of the largest and smallest of the given numbers and their arithmetic average
//and prints them in the console.
//For example, for a series of given numbers: 1, -4, 2, 17, 0, the program should write in the console the numbers: 13, 6.5.
//Get the data from the user in the console using the Scanner class.