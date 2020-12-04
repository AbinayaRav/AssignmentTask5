package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an input string : ");
        String s = new String(scan.next());
        String s2 = new String();
        for (String s1 : s.split(" ")) {
            s2 = s2.concat(s1);
        }
        int count;
        boolean flag = true;
        for (int i = 0; i < s2.length(); i++) {
            count = 0;
            for (int j = i + 1; j < s2.length(); j++) {
                if (Character.toUpperCase(s2.charAt(i)) == Character.toUpperCase(s2.charAt(j))) {
                    count++;
                }
            }
            if (count > 0) {
                flag = false;
                break;
            }
        }
        System.out.println((flag) ? "The string has all unique characters" : "The string doesn't have unique characters");
    }
}
