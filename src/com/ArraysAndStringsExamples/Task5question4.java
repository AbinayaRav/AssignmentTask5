package com.ArraysAndStringsExamples;

import java.util.Scanner;

public class Task5question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a input string : ");
        char[] ch = scan.nextLine().trim().toCharArray();
        int count = 1;
        char m;
        for (int i = 0; i < ch.length; i++) {
            m = ch[i];
            for (int j = i + 1; j < ch.length; j++) {
                if (Character.toUpperCase(m) == Character.toUpperCase(ch[j]) && !(ch[j] == ' ')) {
                    count++;
                    break;
                }
            }
        }
        if (count > 1)
            System.out.println("The input string is not an isogram");
        else if (count == 1)
            System.out.println("The input string is an isogram");
    }
}
