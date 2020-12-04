package com.ProgrammingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Task7Question2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string input  : ");
        char[] ch = scan.next().toCharArray();
        int count;
        for (int i = 0; i < ch.length; i++) {
            count = 0;
            for (int j = i + 1; j < ch.length; j++) {
                if (Character.toUpperCase(ch[i]) == Character.toUpperCase(ch[j])) {
                    count++;
                    continue;
                }
            }
            if (count == 0) {
                System.out.println("The fist non repeated letter in the string is " + ch[i]);
                break;
            }
        }
    }
}
