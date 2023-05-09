package org.example.homework_nr_8;

public class Elephant extends Erbivor implements Animal {


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

    @Override
    public void playing() {
        Animal.super.playing();
    }

    Animal elephant = new Elephant();

    @Override
    void graze() {
               System.out.println("The elephant is eating plants.");
        }
   /* elephant.eat();
    elephant.sleep();
    elephant.makeSound();
    elephant.move();
    elephant.playing();
    Animal.varietyInfo();
*/
}


