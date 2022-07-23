package io.zipcoder.polymorphism;

import com.sun.xml.internal.ws.util.StringUtils;

public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return "*animal noises*";
    }
    public String getName() {
        return StringUtils.capitalize(name);
    }
    public void setName(String name) {
        this.name = name;
    }
}
