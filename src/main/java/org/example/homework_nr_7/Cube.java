package org.example.homework_nr_7;

public class Cube extends ThreeDimensionalShape {
    public double side;
    public Cube(double s){
        side = s;
    }

    @Override
    double area() {
        return 6 * side * side;
    }
    double volume(){
        return  side * side *side;
    }
}
