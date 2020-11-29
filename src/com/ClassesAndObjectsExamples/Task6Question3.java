package com.ClassesAndObjectsExamples;

public class Task6Question3 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[]{new Student(), new Student("Jack"),new Student("Nicole"),
        new Student("Claire"), new Student(), new Student("AJ")};
        System.out.println("The list of student names in the class are : ");
        for (int i = 0; i< studentArray.length; i++)
        {
            //System.out.println(i+1 + ". "+studentArray[i].getStudentName());
            System.out.println(i+1 + ". "+studentArray[i].toString());
        }
    }
}
