package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat cat = new Cat("Garfield");

    @Test
    public void testCatSpeak() {
        String expectedCatSpeak = "meow...meow";
        String actualCatSpeak = cat.speak();

        assertSame(expectedCatSpeak, actualCatSpeak);
        assertTrue(actualCatSpeak.contains("meow"));
    }
}