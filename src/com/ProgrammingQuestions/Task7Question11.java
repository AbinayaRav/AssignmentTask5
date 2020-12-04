package com.ProgrammingQuestions;

import java.security.Key;
import java.util.*;

public class Task7Question11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new LinkedHashMap<>();
        hashmap.put(10, "Jack");
        hashmap.put(7, "Jill");
        hashmap.put(1, "Annie");
        hashmap.put(8, "Claire");
        hashmap.put(5, "Sophie");
        hashmap.put(6, "Amber");
        hashmap.put(3, "Bob");
        Task7Question11 task = new Task7Question11();
        System.out.println("The unsorted input hashmap's keys and values are : ");
        for (Map.Entry e : hashmap.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
        System.out.println("*********************************************************************");
        System.out.println("After sorting by keys we have the output as follows : ");
        HashMap<Integer, String> hashMap1;
        hashMap1 = task.sortHashMapByKeyAndValue(hashmap, 0);
        for (Map.Entry e : hashMap1.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
        System.out.println("*********************************************************************");
        System.out.println("After sorting by values we have the output as follows : ");
        hashMap1 = task.sortHashMapByKeyAndValue(hashmap, 1);
        for (Map.Entry e : hashMap1.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    }

    public HashMap<Integer, String> sortHashMapByKeyAndValue(HashMap hashMap, int flag) {
        LinkedList<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hashMap.entrySet());
        {
            Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
                @Override
                public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                    if (flag == 1)
                        return (o1.getValue()).compareTo(o2.getValue());
                    else
                        return (o1.getKey()) - (o2.getKey());
                }
            });
        }
        HashMap<Integer, String> hashMap1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> e : list) {
            hashMap1.put(e.getKey(), e.getValue());
        }
        return hashMap1;
    }
}
