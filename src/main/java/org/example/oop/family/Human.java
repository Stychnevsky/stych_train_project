package org.example.oop.family;

public abstract class Human {
    protected final String name;
    protected final String surname;
    protected int age;


    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    public void sleep() {
        System.out.printf("%s %s is sleeping... ",this.name, this.surname);
    }
    public abstract String eat();
}

