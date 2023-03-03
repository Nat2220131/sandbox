package org.example.Inheritence;
import java.util.*;
public class Driver {
    public static void main(String[] args){

        //polymorphism
        Animal clam = new Clam();
        Animal bat = new Bat();
        Animal crocodile = new Crocodile();
        Animal hagfish = new Hagfish();
        Animal ostritch = new Ostrich();

        List<Animal> animals = new ArrayList();
        animals.add(clam);
        animals.add(bat);
        animals.add(crocodile);
        animals.add(hagfish);
        animals.add(ostritch);

        for(Animal animal : animals){
            System.out.println(animal);
        }
    }
}
