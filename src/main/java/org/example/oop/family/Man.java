package org.example.oop.family;

import org.example.oop.sport.Sport;
import org.example.oop.sport.Sportable;

public class Man extends Adult implements Sportable {
    protected int strength;
    public Man(String name, String surname, int age) {
        super(name, surname, age);
        this.strength = 0;
    }

    public int getStrength(){
        return this.strength;
    }
    @Override
    public void work() {
        System.out.println("Мужчина работает на заводе\n");
    }

    @Override
    public String eat() {
        System.out.println("Мужчины едят много и быстро\n");
        return "Мужчины едят";
    }

    public void makeSport(Sport sport){
        this.strength += sport.getEffective();
    }
}
