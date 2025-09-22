package com.bridgelabz.oops.levelone;
class Circle{
    double radius;

    public Circle(){
        this(2.0);
    }

    public Circle(double radius){
        this.radius = radius;
    }
    void displayInfo(){
        System.out.println("Radius: "+radius);
        System.out.println();
    }
}
public class Problem_02 {
    public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.displayInfo();

    Circle c2 = new Circle(5.5);
    c2.displayInfo();
    }
}
