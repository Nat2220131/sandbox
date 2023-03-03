package org.example.Inheritence;

public class Clam extends Mollusca{


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
    public String echo() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Clam{ Howdy - I'm a clam!");
        sb.append('}');
        return sb.toString();
    }
}
