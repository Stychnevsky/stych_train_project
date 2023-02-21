package org.example.oop.family;

public class Woman extends Adult{
    public Woman(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void work() {

    }

    @Override
    public String eat() {
        System.out.println("Женщина утонченно кушает\n");
        return "Женщина ест";
    }
}
