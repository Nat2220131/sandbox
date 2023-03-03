package org.example.Inheritence;

public abstract class Vertebrate implements Animal{
    public String toString(){
        return getClass().getSimpleName() + " I'm a vertebrate.";
    }
}
