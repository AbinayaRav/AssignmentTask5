package com.ArraysAndStringsExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the integer array : ");
        Integer[] numbers = new Integer[scan.nextInt()];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        if (Arrays.stream(numbers).filter(x -> (x % 2 == 0)).count() < Arrays.stream(numbers).filter(y -> (y % 2 == 1)).count()) {
            System.out.println("The list of even numbers from an array of odd numbers are : ");
            Arrays.stream(numbers).filter(x -> (x % 2 == 0)).forEach(y -> {
                System.out.println(y);
            });
        } else {
            System.out.println("\nThe list of odd numbers from an array of even numbers are : ");
            Arrays.stream(numbers).filter(x -> (x % 2 == 1)).forEach(y -> {
                System.out.println(y);
            });
        }
    }
}
