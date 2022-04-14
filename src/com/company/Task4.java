package com.company;

import java.util.Scanner;

public class Task4 {
    Scanner scanner = new Scanner(System.in);

    public void calc (){
        System.out.println("Enter please a number: ");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println("I am interrupting work. (Number should be bigger than 1 ;))");
        } else if (num <=3) {
            System.out.println("Yes. " + num + " is prime number.");
        }
        else if (((num % 2) == 1 && (num % 3) > 0)){
            System.out.println("Yes. " + num + " is prime number.");
        } else {
            System.out.println("No. " + num + " is NOT prime number.");
        }
    }

    public void DavidCalc() {
        System.out.println("Task 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int input = scanner.nextInt();
        int mid = input / 2;
        int flag = 0;

        if (input <= 1) {
            System.out.println("I am interrupting work.");
            return;
        }

        for (int i = 2; i <= mid; i++) {
            if (input % i == 0) {
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

}
// Write a program that takes an integer greater than 1 from the user and checks if the number is a prime number.
// In the case when this number is a prime number, the program will write a message "Yes" in the console,
// otherwise it will write a message "No" in the console.
//If the user gives a number less than or equal to 1, the program will write in the console the message:
// "I am interrupting work"   Get the data from the user in the console using the Scanner class.