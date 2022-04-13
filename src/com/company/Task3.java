package com.company;

import java.util.Scanner;

public class Task3 {
    Scanner scanner = new Scanner(System.in);

    void calc() {
        System.out.println("Input please a number, and I'll say you all its divisors.");
        int input = scanner.nextInt();

        for (int i = input; i <= input && i != 0; i--) {
            if(input % i == 0) {
                System.out.println(input/i);
            }
        }
    }
}

//Write a program that takes an integer from the user and prints all its divisors in the console, each divisor in seperate line.
//For example, for the number 21, the program should write in the console the numbers: 1, 3, 7, 21 (in new line each)
// Get the data from the user in the console using the Scanner class.