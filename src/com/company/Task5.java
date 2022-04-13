package com.company;

import java.util.Scanner;

public class Task5 {

    Scanner scanner = new Scanner(System.in);


  //  int[] list = new int[];
    int input;
    int counter = 0;
    int j = 0;
    int sum = 0;
    int sumOf[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //sumOf[j]
    int table[] = {6, 5, 4, 5, 10, 5, 8, 3, 1, 0, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7}; //table[i]


    void calc() {
//        System.out.println("Please input as much as you want numbers, or put 0 if you want to end.");
//        input = scanner.nextInt();
        //input = list[i];

        for (int i = 0; i < table.length; i++) {
            while (j < sumOf.length) {
                if (table[i] == sumOf[j]) {
                    sumOf[j] = sum + 1;
                }
                j++;
            }
        }
    }


}

//Write a program that counts how many times each of the numbers has appeared in the prepared table and prints a summary in the console. An array can contain ** only ** numbers from 1 to 10.
//For example, for the table [6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7] , the program should write in the console the number of occurrences of each number:
//1 - 1
//2 - 1
//3 - 3
//4 - 3
//5 - 3
//6 - 4
//7 - 1
//8 - 2
//9 - 0
//10 - 2
//An array containing numbers is prepared as the variable numbers.