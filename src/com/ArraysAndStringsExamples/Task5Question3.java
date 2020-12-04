package com.ArraysAndStringsExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the input string :");
        String inputString = new String(scan.nextLine());
        System.out.println("The resultant String without any spaces is : " + String.join("", inputString.trim().split(" ")));

    }
}
