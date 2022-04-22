package com.company;

import java.util.Arrays;

public class Task10 {
    int[] numbers = {49, 50, 1, 3, 200, 2, 4, 70, 5, 13, 11, 12};
    int[] num2 = new int[numbers.length - 2];
    int multiplier = 2;

    public void multi(){
        for (int i = 1; i < numbers.length-1; i++){
            numbers[i] = numbers[i] * multiplier;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void DavidCalc(){
        // loop through each element in array skipping the first and the last iteration
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || i == numbers.length - 1) {
                continue;
            }

            // multiply the value of the elements with given value and save result to new array
            num2[i-1] = numbers[i] * multiplier;
        }
        System.out.println(Arrays.toString(num2));
    }
}

//Write an array in which we should multiply all elements, except the first and last elements,
// in the Array by the provided integer. The method should then return a new Array with the multiplied values.