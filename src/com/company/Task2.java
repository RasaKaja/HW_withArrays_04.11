package com.company;

import java.util.Scanner;

public class Task2 {

    int input, sum;
    int minNum;
    int maxNum;

    public void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number, or put 0 if you want to end.");
        input = scanner.nextInt();

        if (input < 0) {
            minNum = input;
        } else {
        minNum = input;
        }

        while (input != 0){
            if (input > maxNum) {
                maxNum = input;
                minNum = minNum;
                //System.out.println("MAX: " + maxNum);
                //System.out.println("MIN: " + minNum);
            } else if (input < minNum){
                minNum = input;
                //System.out.println("MIN: " + minNum);
                //System.out.println("MAX: " + maxNum);
            }
            //sum = sum + input;
            input = scanner.nextInt();
        }

        int sum = minNum + maxNum;
        double aritm =  sum / 2;

        System.out.println("Sum of inputted the largest and smallest number is: " + sum);
        System.out.println("Arithmetic average of given numbers is: " + aritm);

    }

//    public void DavidCalc(){
//        Scanner scanner = new Scanner();
//        int num_of_inputs = scanner.nextInt(System.in);
//        int [] number = new int[num_of_inputs];
//        int counter = 0;
//        int input;
//        do {
//            System.out.println("Input a number to add, or put 0 to end.");
//            input = scanner.next();
//
//            if (input == 0) {
//                break; // gets out of the loop
//            }
//            number[counter++] = input;
//        } while (input !=0 && counter < num_of_inputs);
//
//        int largest = number[0];
//        int smallest = number[0];
//        int sum;
//
//        for (int num : number) {
//            if (num > largest) {
//                largest = num;
//            }
//            if (num < smallest) {
//                smallest = num;
//            }
//        }
//
//        sum = largest + smallest;
//        double arit = sum / 2;
//
//        System.out.println(sum);
//        System.out.println(arit);
//    }

}

//Write a program that retrieves integers from the user. Receiving data ends with the number 0 (not included in the data).
//Then, the program calculates the sum of the largest and smallest of the given numbers and their arithmetic average
//and prints them in the console.
//For example, for a series of given numbers: 1, -4, 2, 17, 0, the program should write in the console the numbers: 13, 6.5.
//Get the data from the user in the console using the Scanner class.