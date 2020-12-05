package com.ProgrammingQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task7Question12 {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array : ");
        int num = scan.nextInt();
        int[] intArray = new int[num];
        System.out.println("Please enter the array integer elements: ");
        for (int i = 0; i < num; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println("Please enter the target sum value : ");
        int target = scan.nextInt();
        Task7Question12 task = new Task7Question12();
        for (int i = 0; i < intArray.length; i++) {
            int result = intArray[i];
            ArrayList<Integer> arrL = new ArrayList<>();
            arrL.add(intArray[i]);
            if (result == target) {
                task.list.add(new ArrayList<>(Arrays.asList(result)));
            }
            for (int j = i + 1; j < intArray.length; j++) {
                result += intArray[j];
                if (result < target) {
                    arrL.add(intArray[j]);
                    continue;
                }
                if (result == target) {
                    arrL.add(intArray[j]);
                    task.list.add(new ArrayList<>(arrL));
                }


            }
        }
        System.out.println("The list of all possible subarrays have their sum equal to " + target + " is : ");
        Stream stream = Stream.of(task.list);
        stream.forEach(e -> {
            System.out.print(e + "\t");
        });

    }


}

