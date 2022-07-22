package io.zipcoder.polymorphism;

public abstract class Pet {
    String name;

    public String speak() {
        return "*animal noises*";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
