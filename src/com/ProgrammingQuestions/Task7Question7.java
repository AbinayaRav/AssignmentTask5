package com.ProgrammingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task7Question7 {

    public static void main(String[] args) {
        String str = new String("Hello WOrld");
        int count;
        char m = ' ';
        Map<Character, Integer> mapList = new HashMap<Character, Integer>();
        System.out.println("The occurences of every letter in the string are as follows : ");
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(str.charAt(j))) {
                    count++;
                    m = str.charAt(i);

                }
            }
            if (!mapList.containsKey(str.charAt(i)))
                mapList.put(str.charAt(i), count);
        }
        mapList.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " = " + e.getValue());
        });
    }
}
