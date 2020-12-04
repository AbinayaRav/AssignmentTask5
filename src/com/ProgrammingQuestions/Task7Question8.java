package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Question8 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an input string whose permutation needs to be resolved : ");
        String s = scan.next();
        Task7Question8 task = new Task7Question8();
        System.out.println("The permutations of the string are as follows : ");
        task.printAllPermutationsOfString(s, 0, s.length());
        System.out.println("**************************** The total number of permutations in the string is : " + count + " ***************************************************");
    }

    public void printAllPermutationsOfString(String s, int start, int end) {
        if (start == end - 1) {
            System.out.println(s);
            count++;
        } else {
            for (int i = start; i < end; i++) {
                s = swappedResult(s, start, i);
                printAllPermutationsOfString(s, start + 1, end);
                s = swappedResult(s, start, i);
            }
        }
    }

    public String swappedResult(String str, int start, int end) {
        char[] charArray = str.toCharArray();
        char temp = ' ';
        temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        return new String(charArray);
    }
}

