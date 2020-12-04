package com.ClassesAndObjectsExamples;

public class Employee {
    private String empName;
    private int yearOfJoining;
    private long salary;
    private String address;

    public Employee(String empName, int yearOfJoining, long salary, String address) {
        this.empName = empName;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}

