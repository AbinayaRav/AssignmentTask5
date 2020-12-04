package com.ArraysAndStringsExamples;

import java.util.Scanner;

public class Task5Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the input String of braces :");
        StringBuffer s = new StringBuffer(scan.nextLine());
        boolean flag = true;
        while (flag) {
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (((s.charAt(i) == '[' && s.charAt(0) == ']') || (s.charAt(0) == '[' && s.charAt(i) == ']')) ||
                        (s.charAt(i) == '{' && s.charAt(0) == '}') || (s.charAt(0) == '{' && s.charAt(i) == '}') ||
                        (s.charAt(i) == '(' && s.charAt(0) == ')') || (s.charAt(0) == '(' && s.charAt(i) == ')')) {
                    s.deleteCharAt(i);
                    s.deleteCharAt(0);
                    count++;
                    break;
                }
            }
            if (count % 2 == 0 && s.length() == 0) {
                System.out.println("Result is true");
                flag = false;
            } else if (s.length() != 0 && count % 2 != 0) {
                System.out.println("Result is false");
                flag = false;
            }
        }
    }
}
