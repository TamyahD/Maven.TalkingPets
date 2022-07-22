package io.zipcoder.polymorphism;

public class GuineaPig extends Pet{

    public GuineaPig(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "squeee squEEeee squee";
    }
}
