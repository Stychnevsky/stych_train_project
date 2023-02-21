package org.example.exceptions;

import org.example.oop.family.Child;

public class ChildCannotDoCrossfitException extends RuntimeException{
    public ChildCannotDoCrossfitException(Child child, String message){
        super(message);
        System.out.printf("%s %s пытался заниматься кроссфитом", child.getName(), child.getSurname());
    }
}
