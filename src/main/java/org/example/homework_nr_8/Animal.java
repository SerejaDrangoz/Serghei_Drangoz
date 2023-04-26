package org.example.homework_nr_8;

public interface Animal {
    String name = null;
    int age = 0;
    String variety = null;


    void eat();
    public void move();
    public void sleep();
    public void makeSound();
    default void playing(){
        System.out.println("Playing");
    }
    static void varietyInfo(String variety){
        System.out.println("Info: " + variety);
    }


}
