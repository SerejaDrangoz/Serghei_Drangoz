package org.example.homework_nr_3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());

        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = 68.0;
        double celsius = converter.toCelsius(fahrenheit);
        System.out.println(fahrenheit + " градусов Фаренгейта = " + celsius + " градусов Цельсия");
        celsius = 20.0;
        fahrenheit = converter.toFahrenheit(celsius);
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
    }
}