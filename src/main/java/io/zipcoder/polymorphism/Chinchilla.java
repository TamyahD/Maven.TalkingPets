package io.zipcoder.polymorphism;

public class Chinchilla extends Pet{

    public Chinchilla(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "squeee squEEeee squee";
    }
}
