package com.ArraysAndStringsExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the input word :");
        StringBuffer str = new StringBuffer(scan.nextLine());
        for (int i = 0; i < str.length(); i++) {
            Character ch = new Character(str.charAt(i));
            if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
                str.setCharAt(i, Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch) && Character.isLetter(ch)) {
                str.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        System.out.println(str);
    }
}
