package org.example.homework_nr_7;

public class Circle extends TwoDimensionalShape{
    public double radius;

    public Circle(double r){
        radius = r;

    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
