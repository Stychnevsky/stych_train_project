package org.example.oop.family;

public class Girl extends Child{
    public Girl(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void play() {

    }

    @Override
    public String eat() {
        System.out.printf("Девочка %s кушает\n", this.name);
        return "Девочка кушает";
    }
}
