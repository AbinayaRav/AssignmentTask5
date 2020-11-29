package com.ClassesAndObjectsExamples;

import java.util.Scanner;

public class Task6Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Real and Imaginary Part of the first complex number : ");
        String number1 = scan.next() + " i"+scan.next();
        System.out.println("Please enter the Real and Imaginary Part of the second complex number : ");
        String number2 = scan.next() + " i"+scan.next();
        Complex c = new Complex();
        System.out.println("The sum of two complex numbers is :"+c.getSumValue(number1 , number2));
        System.out.println("The difference of two complex numbers is :"+c.getDifferenceValue(number1 , number2));
        System.out.println("The product of two complex numbers is :"+c.getProductValue(number1 , number2));
    }
}
