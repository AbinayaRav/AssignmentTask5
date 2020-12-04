package com.ClassesAndObjectsExamples;


public class Task6Question6 {
    public static void main(String[] args) {
        System.out.println("When no parameter is passed to the constructor, the output is :");
        Programming prog = new Programming();
        System.out.println(prog.toString());
        System.out.println("When a parameter(programming language) is passed to the constructor, the output is :");
        Programming prog1 = new Programming("JAVA");
        System.out.println(prog1.toString());
        System.out.println("When a parameter(programming language) is passed to the constructor, the output is :");
        Programming prog2 = new Programming(".NET");
        System.out.println(prog2.toString());
        System.out.println("When no parameter is passed to the constructor, the output is :");
        Programming prog3 = new Programming();
        System.out.println(prog3.toString());
    }
}


class Programming {
    private String language;

    public Programming() {
        this.language = "Programming Languages";
    }

    public Programming(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "I love " + language;
    }
}
