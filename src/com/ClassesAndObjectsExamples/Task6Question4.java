package com.ClassesAndObjectsExamples;


public class Task6Question4 {
    public static void main(String[] args) {
        float length = 10.2f;
        float breadth = 20.5f;
        System.out.println("The length of a rectangle is " + length);
        System.out.println("The breadth of a rectangle is " + breadth);
        Rectangle rect = new Rectangle(length, breadth);
        System.out.println("Area of the rectangle with length and breadth given is : " + rect.printArea());
        Rectangle rect1 = new Rectangle(length);
        System.out.println("Area of the rectangle with length given is : " + rect1.printArea());
        Rectangle rect2 = new Rectangle();
        System.out.println("Area of the rectangle without any parameters is : " + rect2.printArea());
    }
}


class Rectangle {
    private float length;
    private float breadth;

    public Rectangle() {
        super();
    }

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(float side) {
        this.length = side;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }


    public float printArea() {
        if (this.length != 0 && this.breadth != 0)
            return this.length * this.breadth;
        else if (this.length != 0)
            return this.length * this.length;
        else
            return 0;

    }
}
