package org.example.homework_nr_8;

public abstract class Erbivor{
    abstract void graze();
    void relaxation(){
        System.out.println("Отдыхает");
    }

}
class Elephant extends Erbivor {

    @Override
    void graze() {
        System.out.println("The elephant is eating plants.");
    }
    Erbivor elephant = new Elephant();
    elephant.graze();
    elephant.relaxation();

}

