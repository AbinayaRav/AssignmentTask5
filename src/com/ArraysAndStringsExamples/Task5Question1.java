package com.ArraysAndStringsExamples;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Task5Question1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input String : ");
        String inputString = scan.nextLine();
        int minSize = Integer.MAX_VALUE;
        String s2 = new String(" ");
        int count = 0;
        for (String s1 : inputString.split(" ")) {
            if (s1.length() < minSize) {
                s2 = s1;
                minSize = s1.length();
                count++;
            }
        }
        System.out.println("The word with the smallest length from the given input string is : " + s2);

    }
}
