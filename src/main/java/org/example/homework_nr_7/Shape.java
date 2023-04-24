package org.example.homework_nr_7;

public abstract class Shape {
    abstract double area();

    public static void main(String[] args){
        TwoDimensionalShape circle = new Circle(3);
        System.out.println("Area circle: " + circle.area());
        TwoDimensionalShape square = new Square(5);
        System.out.println("Area square: " + square.area());
        ThreeDimensionalShape cube = new Cube(5);
        System.out.println("Area of cube: " + cube.area());
        System.out.println("Volume of cube: " + ((Cube) cube).volume());
        ThreeDimensionalShape sphere = new Sphere(6);
        System.out.println("Area of sphere: " + sphere.area());
        System.out.println("Volume of sphere " + ((Sphere) sphere).volume());
    }
}
