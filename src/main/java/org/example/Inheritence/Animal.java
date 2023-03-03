package org.example.Inheritence;

public interface Animal {
    public static final String varible1 = "Hello There";
    void eat();
    void reproduce();
    void breath();
    public default String walk() {
        return "I'm walking";
    }
}

