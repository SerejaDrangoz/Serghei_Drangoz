package org.example.homework_nr_7;

public class Sphere extends ThreeDimensionalShape{
    public double radius;
    public Sphere(double r){
        radius = r;

    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }
    double volume(){
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
}
