package org.example.homework_nr_3;


/*public class Circle {

        double radius = 5;
        double p = 3.14;
        public void calculateArea() {
        double area = p * (radius * 2);
                /*= Math.PI * Math.pow(this.radius, 2);
        System.out.println("Площадь круга: " + area);
    }
        public Circle(double radius) {
            this.radius = radius;
        }

 */
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = 3.14 * (radius * radius);
        return area;

    }

   /* public static void main(String[] args) {
        Circle circle = new Circle(); // создание объекта Circle с радиусом 5
        circle.calculateArea(); // вызов метода calculateArea()
    }*/
}


