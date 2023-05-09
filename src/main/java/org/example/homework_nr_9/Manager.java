package org.example.homework_nr_9;

public class Manager extends Employee implements AttenTraining, Interview{

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void conductTraining() {
        System.out.println("Manager " + getName() + " is conducting training.");
    }

    // Реализация метода conductInterview() с помощью лямбда-выражения
    public void conductInterview() {
        System.out.println("Manager " + getName() + " is conducting an interview.");
    }
}

