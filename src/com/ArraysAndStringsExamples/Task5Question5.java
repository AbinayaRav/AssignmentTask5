package com.ArraysAndStringsExamples;


import java.util.Scanner;

public class Task5Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the input word :");
        String str = new String(scan.nextLine());
        String[] s1 = str.split(" ");
        System.out.println("The resultant string is : ");
        for (String s2 : s1) {
            System.out.print(new StringBuffer(s2).reverse() + " ");
        }

    }

}
