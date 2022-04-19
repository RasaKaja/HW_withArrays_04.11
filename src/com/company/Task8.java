package com.company;

public class Task8 {
    public void calc(){
        int array[] = {1, 2, 4, 5, 6};
        int target = 6;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    System.out.println(array[i] + " + " + array[j] + " = 6");
                }
            }
        }
    }

}

//Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
//Sample array: [1,2,4,5,6]
//Target value: 6