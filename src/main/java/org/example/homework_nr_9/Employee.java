package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;




    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Pavel Sisko", 37, 32000);
        employees[1] = new Programmer("Ion Kutselaba", 25, 50000);
        employees[2] = new Manager("Dan Balan", 30, 30000);

        for (Employee employee : employees) {
            if (employee instanceof Interview) {
                Interview interview = (Interview) employee;
                interview.conductInterview();
            }

            if (employee instanceof AttenTraining) {
                AttenTraining attendeeTraining = (AttenTraining) employee;
                attendeeTraining.conductTraining();
            }
        }
            System.out.println();

        Manager manager = new Manager("Serghei Jura", 26, 50000);
        Programmer programmer = new Programmer("Serghei Antonov", 27, 60000);
        AttenTraining managerTraining = () -> manager.conductTraining();
        AttenTraining programmerTraining = () -> programmer.conductTraining();
        managerTraining.conductTraining();
        programmerTraining.conductTraining();


        List<AttenTraining> attendees = new ArrayList<AttenTraining>();
        MeetingRoom meetingRoom = new MeetingRoom(attendees);
        meetingRoom.conductTraining();

        // Проводим интервью только для менеджера с помощью лямбда-выражения
        Interview managerInterview = () -> manager.conductInterview();
        managerInterview.conductInterview();
    }


}
