package com.company;

import java.util.Scanner;

public class Task1 {
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Please input the number, or put 0 if you want to end.");
    int num = scanner.nextInt();

    int sum = 0;

    void calc() {
        while (num != 0) {
            sum = sum + num;
            num = scanner.nextInt();
        }
        System.out.println("The sum of given numbers: " + sum);
    }
}

// Write a program that takes numbers from the user as long as the number 0 is not given.
// When the number 0 is given, the program calculates the sum of the numbers given and prints it in the console.
// For example, for a series of given numbers: 3, 2, 5, 1, 0, the program should write the number 11 in the console.
// Get the data from the user in the console using the Scanner class

// nextLine() - for String