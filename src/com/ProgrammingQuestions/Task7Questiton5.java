package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Questiton5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the input string : ");
        String s = scan.nextLine();
        String[] str = s.split(" ");
        System.out.println("The number of words in the string is : " + str.length);
    }
}
