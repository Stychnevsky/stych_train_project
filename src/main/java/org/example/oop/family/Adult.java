package org.example.oop.family;

public abstract class Adult extends Human{
    public Adult(String name, String surname, int age) {
        super(name, surname, age);
    }

    public abstract void work();
}
