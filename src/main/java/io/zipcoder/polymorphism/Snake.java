package io.zipcoder.polymorphism;

public class Snake extends Pet{

    public Snake(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "hiissss hiss hsssss";
    }
}
