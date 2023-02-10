package org.example.oop.family;

public abstract class Child extends Human {
    public Child(String name, String surname, int age) {
        super(name, surname, age);
    }

    public abstract void play();
}
