package com.company;

public class Task6 {
    public void calc() {
        int list[] = {6, 5, 4, 5, 10, 5, 8, 3, 1, 0, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7}; //

        int sum = 0;
        int a = 0;

        // checking the first list value with other values, and prints it if there are duplicate
        for (int x = 0; x < list.length; x++) {
            if (list[x] == list[a]) {
                sum = sum + 1;
                a = 0;
            }
        }
        if (sum > 1) {
            System.out.println(list[a] + " is duplicate, and there are them: " + sum);
        }
        sum = 0;

        //
        int y = 1;
        for (int x = 0; x < list.length; x++) {
            while (y < list.length) {
                for (x = 0; x < list.length; x++) {

                    if (list[x] == list[y]) {
                        y = y + 1;
                        //System.out.println("32 line y= " + y);
                    }
                    else {
                        while (x != 0) {
                            x = x - 1;
                            //System.out.println("37 line x= " + x);

                            if (list[x] == list[y]) {
                                y = y + 1;
                                //System.out.println("41 line y= " + y);
                                break;
                            } else {
                                for (a = y; a < list.length; a++) {
                                    sum = 0;
                                    if (list[y] == list[a]) {
                                        sum = sum + 1;
                                    }
                                }

                                if (sum > 1) {
                                    System.out.println(list[y] + " is duplicate, and there are them: " + sum);
                                }
                                sum = 0;
                            }
                        }
                        y = y + 1;
                    }

                    //if y is equal to last element - finish loop
                    if (y == list.length) {
                        break;
                    }

                    a = y-1;
                    y = y-1;
                    //System.out.println("62 line: x = " + x + "; y = " + y + "; a = " + a);
                    for (a = y; a < list.length; a++) {
                        //sum = 0;
                        if (list[y] == list[a]) {
                            sum = sum + 1;
                        }
                    }
                    if (sum > 1) {
                        System.out.println(list[y] + " is duplicate, and there are them: " + sum);
                    }
                    sum = 0;

                    y = y + 1;
                    x = y - 2;

                }
            }
        }
    }

    public void DavidCalc() {
        int[] table = {6, 5, 4, 5, 10, 5, 8, 3, 1, 0, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7, 9, 10, 1};
        int [] table2 = new int[table.length];

        // loop through each element in array
        // set the current element to a variable current to truck if that element is duplicate
        // loop through the array comparing the current element value with the other values to check if there is a duplicate
        // check if current item already exists in the duplicate array, and skip iteration if it does
        // add duplicate element new array to store numbers that are duplicate

        // loop through each item in the array
        for (int i = 0; i < table.length; i++) {

            // set the current item to variable current
            int current = table[i];

            // loop through other items in the array to determine if there is a duplicate
            for (int j = i + 1; j < table.length; j++) {

                // check if current item exists in array of duplicate item and exit loop if true meaning we don't want
                // to have more than one values of the duplicated item
                if (contains(table2, current)) {
                    break;
                }

                // check if current item is a duplicate and print message to console if yes, and also
                if (current == table[j]) { //check if the current is a duplicate
                    System.out.println(current + " is a duplicate!");
                    table2[i] = current;

                }
            }
        }

    } //close the method

    // method that helps check if an element is present in an array
    public boolean contains(int[] array, int key) {
        // loops through array
        for (int i : array) {
            //check if key passed is equal to any element in array and return if true
            if (i == key) {
                return true;
            }
        }
        // after loop is completed and nothing is returned than key doesn't exist in array so return false
        return false;
    }
}

//Write a Java program to find the duplicate values of an array of integer values.