package com.ProgrammingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Task7Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = scan.nextInt();
        int[] intArray = new int[size];
        System.out.println("Please enter the elements : " );
        for(int i = 0; i < intArray.length; i++)
        {
            intArray[i] = scan.nextInt();
        }
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("The maximum value in the array is : "+max);
    }
}
