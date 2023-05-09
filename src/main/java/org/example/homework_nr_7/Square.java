package org.example.homework_nr_7;

public class Square extends TwoDimensionalShape{
    public double side;
    public Square(double s){
        side = s;

    }

    @Override
    double area() {
        return side * side;
    }
}
