package org.example.homework_nr_3;

public class TemperatureConverter {
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }


}
