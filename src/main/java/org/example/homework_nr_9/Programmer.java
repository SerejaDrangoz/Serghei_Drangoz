package org.example.homework_nr_9;

public class Programmer extends Employee implements AttenTraining{

    public Programmer(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void conductTraining() {
        System.out.println("Programmer " + getName() + " is conducting training.");
    }

}
