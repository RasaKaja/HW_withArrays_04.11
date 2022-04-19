package com.company;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Task9 {
    //int[] numbers = {49, 1, 3, 200, 2, 4, 70, 5};
    int[] numbers = {1, 52, 3, 48, 51, 47, 4, 49, 50, 5, 2}; // [1 2 3 4 5] [47 49 49 50 51 52]
    //int[] numbers = {1, 2, 3, 4, 5, 49, 70, 200};


    public void InsertionSort(int[] array) {
        //Iterate over the array and insert each item in the right position
        //We start with i = 1, because we cannot compare the first value to any other item
        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            //Declare j to represent of sorted Item in the list
            int j;
            for (j = i; j > 0 && array[j - 1] > current; j--) {
                array[j] = array[j - 1]; //Move the higher value to the right
            } // after first iteration j = 0
            array[j] = current;
        }
    }

    public void newNumbers(int[] array) {
        int counter = 1;
        int MaxCounter = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == (array[i - 1] + 1)) {
                counter = counter + 1;

                if (counter > MaxCounter) {
                MaxCounter = counter;
                } else {
                MaxCounter = MaxCounter;
                }

            } else {
                counter = 1;
            }
        }
        System.out.println("Array length is: " + MaxCounter);
    }
}

//Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
//Sample array: [49, 1, 3, 200, 2, 4, 70, 5] …. [49, 50, 1, 3, 200, 2, 4, 70, 5, 13, 11, 12]
//The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.