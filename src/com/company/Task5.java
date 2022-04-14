package com.company;

public class Task5 {

    int sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10;
    int table[] = {6, 5, 4, 5, 10, 5, 8, 3, 1, 0, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7}; //table[i]

    public void calc_switch(){
             for (int i = 0; i < table.length; i++) {
            switch (table[i]) {
                case 1:
                    sum1 = sum1 + 1;
                    break;
                case 2:
                    sum2 = sum2 + 1;
                    break;
                case 3:
                    sum3 = sum3 + 1;
                    break;
                case 4:
                    sum4 = sum4 + 1;
                    break;
                case 5:
                    sum5 = sum5 + 1;
                    break;
                case 6:
                    sum6 = sum6 + 1;
                    break;
                case 7:
                    sum7 = sum7 + 1;
                    break;
                case 8:
                    sum8 = sum8 + 1;
                    break;
                case 9:
                    sum9 = sum9 + 1;
                    break;
                case 10:
                    sum10 = sum10 + 1;
                    break;
            }
        }
        System.out.println("1 - " + sum1);
        System.out.println("2 - " + sum2);
        System.out.println("3 - " + sum3);
        System.out.println("4 - " + sum4);
        System.out.println("5 - " + sum5);
        System.out.println("6 - " + sum6);
        System.out.println("7 - " + sum7);
        System.out.println("8 - " + sum8);
        System.out.println("9 - " + sum9);
        System.out.println("10 - " + sum10);
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