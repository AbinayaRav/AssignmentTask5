package com.ClassesAndObjectsExamples;

public class Task6Question2 {
    public static void main(String[] args) {
        Employee[] eArray = new Employee[]
                { new Employee("Robert", 1994, 200000, "64C- Walls Streat"),
        new Employee("Sam", 2000, 200000, "68D- Walls Streat "),
        new Employee("John", 1999, 200000, "26B- Walls Streat")};

        System.out.format("%-10s %10s %9s %13s","EmployeeName","YearOfJoining","Salary","Address\n");
        System.out.format("-------------------------------------------------------------------------------------\n");
        for(Employee emp : eArray)
            System.out.format("%-14s %-14d %-11d %8s",emp.getEmpName(),emp.getYearOfJoining(),emp.getSalary(),emp.getAddress()+"\n");

    }
}
