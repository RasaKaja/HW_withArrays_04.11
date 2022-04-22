package com.company;

public class Task7 {

    public void diff() {
        int list[] = {6, 5, 4, 5, 10, 5, 8, 3, 1, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};

        int min = list[0];
        int max = list[0];

        // finding the smallest value in the list:
        for (int i = 1; i < list.length; i++) {
            if (min < list[i]) {
                min = min;
            } else {
                min = list[i];
            }
        }

        // finding the largest value in the list:
        for (int i = 1; i < list.length; i++) {
            if (max > list[i]) {
                max = max;
            } else {
                max = list[i];
            }
        }

        // printing diff:
        System.out.println("Difference between the largest value '" + max + "' and the smallest value '" + min + "' in array is: " + (max-min));
    }

    public void DavidCalc() {
        int largest;
        int smallest;
        int[] arr = {6, 5, 4, 5, 10, 5, 8, 3, 1, 6, 6, 6, 4, 3, 2, 8, 15, 3, 4, 7};

        largest = arr[0];
        smallest = arr[0];

        for (int num : arr){
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        int diff = largest - smallest;
        System.out.println("The difference between the largest and the smallest value is: " + diff);
    }
}

//Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.