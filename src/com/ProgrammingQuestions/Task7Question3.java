package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Question3 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int size = scan.nextInt();
            int[] ar1 = new int[size];
            int[] ar2 = new int[size];
            System.out.println("Enter the elements in the first array : ");
            for (int m = 0; m < size; m++) {
                ar1[m] = scan.nextInt();
            }
            System.out.println("Enter the elements in the second array : ");
            for (int m = 0; m < size; m++) {
                ar2[m] = scan.nextInt();
            }

            int[] result = new int[ar1.length];
            for (int i = 0; i < ar1.length; i++) {
                for (int j = 0; j < ar2.length; j++) {
                    if (ar1[i] == ar2[j]) {
                        result[i] = ar1[i];
                    }
                }
            }
            System.out.println("The resulting array of intersection of first and second array is : ");
            for (int k : result) {
                if (k == 0)
                    continue;
                else
                    System.out.print(k + " ");
            }
        } catch (Exception e) {
            System.out.println("Please enter the correct input if entered wrong or else try again " + e.getMessage());
        }
    }

}
