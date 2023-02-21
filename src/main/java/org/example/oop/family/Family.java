package org.example.oop.family;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Family {
    public Man husband;
    public Woman wife;
    public ArrayList<Child> children;

    public Family (Man husband, Woman wife, ArrayList<Child> children) {
        this.husband = husband;
        this.wife = wife;
        this.children  = children;
    }

    public void divorce(Adult outgoing) {
        if (outgoing.equals(this.husband)) {
            this.husband = null;
        } else if (outgoing.equals(this.wife)) {
            this.wife = null;
        } else {
            throw new RuntimeException("При разводе может уйти только один из взрослых членов семьи (муж/жена)");
        }
    }

    public String goToTrip(Man boyfriend, Woman girlfriend){
        if (boyfriend.equals(this.husband) && girlfriend.equals(this.wife)) {
            System.out.printf("%s и %s отправились в роматическое путешествие", boyfriend.name, girlfriend.name);
            return "Успешное путешествие";
        } else {
            throw new RuntimeException("Измена! В романитическом путешествии участвует не член семьи");
        }
    }

    public String goToTrip(Man boyfriend, Woman girlfriend, ArrayList<Child> children){
        final int DISNEY_MIN_AGE = 2;
        String childrenNamesList = "";
        for (Child child: children){
            if (child.age < DISNEY_MIN_AGE){
                throw new RuntimeException("Детям до 2 лет нельзя в Диснейленд!");
            }
            childrenNamesList += child.name + ", ";
        }
        if (children.size() > 0) {
            childrenNamesList = childrenNamesList.substring(0, childrenNamesList.length() - 2);
            System.out.printf("%s, %s и %s поехали в Диснейленд", boyfriend.name, girlfriend.name, childrenNamesList);
            return "Успешное путешествие в Дисней";
        } else {
            throw new RuntimeException("Родители не могут ехать в диснейленд без детей");
        }


    }
}
