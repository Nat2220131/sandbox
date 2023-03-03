package org.example.Inheritence;

public class Crocodile extends Reptile{

    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void breath() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Crocodile says what???");
        return sb.toString();
    }
}
