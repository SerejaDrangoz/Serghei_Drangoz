package org.example.homework_nr_7;

public class Stuff extends Person{
    private String school;
    private double pay;

    public Stuff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getPay() {
        return (int) pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString() {
        return "Stuff: " + getName() + " address: " + getAddress() + " school: " + school + " pay: " + pay;
    }
}
