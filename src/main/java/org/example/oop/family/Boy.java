package org.example.oop.family;

import org.example.exceptions.ChildCannotDoCrossfitException;
import org.example.oop.sport.Crossfit;
import org.example.oop.sport.Sport;
import org.example.oop.sport.Sportable;

public class Boy extends Child implements Sportable {
    int strength;
    public Boy(String name, String surname, int age) {
        super(name, surname, age);
        this.strength = 0;
    }

    public int getStrength(){
        return this.strength;
    }
    @Override
    public void play() {

    }

    @Override
    public String eat() {
        System.out.println("Мальчик неряшливо кушает");
        return "Мальчик покушал";
    }

    public void makeSport(Sport sport){
        if (sport instanceof Crossfit){
            throw new ChildCannotDoCrossfitException(this, "Ребенок не может заниматься кроссифтом");
        }
        this.strength += sport.getEffective();
    }
}

