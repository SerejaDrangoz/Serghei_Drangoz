package org.example.homework_nr_8;

public class Elephant implements Animal {


    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is ");
    }
    Animal elephant = new Elephant();
    elephant.eat();
    elephant.sleep();
    elephant.makeSound();
    elephant.move();
    elephant.playing();
    Animal.varietyInfo();

}


