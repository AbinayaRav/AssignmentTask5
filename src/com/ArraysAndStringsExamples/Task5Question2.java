package com.ArraysAndStringsExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the input array : ");
        int n = scan.nextInt();
        Integer[] inputArray = new Integer[n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i< n ;i++) {
            inputArray[i] = scan.nextInt();
        }
        for (int i = 0; i<inputArray.length; i++)
        {
            if(inputArray[i]>max)
            {
                max = inputArray[i];
            }
            if(inputArray[i]<min)
            {
                min = inputArray[i];
            }
        }
        Integer sum = Arrays.stream(inputArray).reduce(0,Integer::sum)- max - min;
        System.out.println("The sum of the given input numbers excluding the highest and lowest values is : " +sum);
    }
}
