package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string input to reverse using String Buffer : ");
        StringBuffer sb = new StringBuffer(scan.next());
        System.out.println("Reversing a string using String Buffer :\n" +sb.reverse());
        System.out.println("Enter a string input to reverse using char array : ");
        String s = new String(scan.next());
        System.out.println("Reversing a string using char array : ");
        char[] charArray = new char[s.length()];
        for(int i = s.length()-1;i>=0;i--)
        {
            charArray[s.length()-i-1] = s.charAt(i);
        }
        System.out.println(new String(charArray));
    }
}
