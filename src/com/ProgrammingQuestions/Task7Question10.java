package com.ProgrammingQuestions;

import java.util.Scanner;

public class Task7Question10 {
    private StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the input string : ");
        String inputString = scan.next();
        System.out.println("The possible combinations of the input string are as follows : ");
        Task7Question10 task = new Task7Question10();
        task.getAllCombinations(inputString, 0, inputString.length());
    }

    public void getAllCombinations(String s, int start, int end)
    {
      for(int i = start; i<end; i++)
      {
          output.append(s.charAt(i));
          System.out.print(output+"\t");
          if(i<s.length()) {
              getAllCombinations(s, i + 1, end);
              output.setLength(output.length()-1);
          }

      }
    }
}
