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
}

//Write a Java program to find the duplicate values of an array of integer values.