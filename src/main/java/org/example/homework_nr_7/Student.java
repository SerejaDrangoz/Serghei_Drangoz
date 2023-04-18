package org.example.homework_nr_7;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, Integer year, Double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
    public String toString() {
       // return String.format("Student " + super.toString(), year, fee);
        return "Student:  " + getName() + " address: " + getAddress() + " Program: " + program + " year: " + year + " fee: " + fee;
    }
}
