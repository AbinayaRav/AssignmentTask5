package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an input number : ");
        String s = new String(scan.next());
        char[] s1 = s.toCharArray();
        int[] intArray = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(s1[i]));
        }
        int armstrongNumber = 0;
        int n = intArray.length;
        for (int j : intArray) {
            armstrongNumber += Math.pow(j, n);
        }
        if (Integer.parseInt(s) == armstrongNumber) {
            System.out.println("The input number is an Armstrong Number");
        } else {
            System.out.println("The input number is not an Armstrong Number");
        }
    }
}

