package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog = new Dog("Snoopy");

    @Test
    public void speak() {
        String actualDogSpeak = dog.speak();
        String expectedDogSpeak = "woof WOOF! bark bArk!";

        assertSame(expectedDogSpeak, actualDogSpeak);
        assertTrue(actualDogSpeak.contains("woof"));
    }
}