package com.tasks.task12;

/**
 * Created by Aliaksandr_Hlekau on 4/20/2017.
 */

import java.util.Scanner;
public class SecondLongestString {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //finding the length of the Array
        int size = 0;
        System.out.println("Please enter the number of cells in array");
        do {
           System.out.println("It should be integer value more than 1");
           if (num.hasNextInt()) {
               size = num.nextInt();
             } else {
                num.next();
               }
            }
            while (size < 2) ;
        //creating Array and filling it with user input
            String[] arr = new String[size];
            for (int j = 0; j < arr.length; j++) {

                System.out.println("Please enter the value of the cell with " + j + " index");
                arr[j] = sc.nextLine();
            }
        //comparing two first cells
            String fir;
            String sec;
            String curr;
            int a;
            int b;
            if (arr[0].length() > arr[1].length()) {
                a = 0;
                b = 1;
            } else {
                a = 1;
                b = 0;
            }
            fir = arr[a];
            sec = arr[b];
        //запускаем цикл для перебора значений в массиве
            for (int i = 2; i < arr.length; i++) {
                curr = arr[i];
                if (curr.length() > fir.length()) {
                    b = a;
                    a = i;
                    fir = arr[a];
                    sec = arr[b];
                } else {
                    if (curr.length() > sec.length()) {
                        b = i;
                        sec = arr[b];
                    }
                }
            }
            System.out.println("The second longest string in the array is " + sec);
            System.out.println("The index of the second longest string in the array is " + b);
        }
    }