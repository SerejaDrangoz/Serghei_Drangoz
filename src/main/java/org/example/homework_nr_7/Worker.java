package org.example.homework_nr_7;

public class Worker {


    public static void main(String[] args) {
        Person somePerson = new Person("Gena", "Sarmizegetusa 92");
        Student someStudent = new Student( "Anton", "Pushkin 56", "C++", 5, 5000.99 );
        Stuff someStuff = new Stuff("Andrei", "Independentei 42", "Tekwill", 1500.25);
        System.out.println(somePerson);
        System.out.println(someStudent);
        System.out.println(someStuff);
    }
}
