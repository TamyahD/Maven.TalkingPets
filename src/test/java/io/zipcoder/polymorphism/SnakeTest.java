package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {
    Snake snake = new Snake("Kaa");

    @Test
    public void speak() {
        String actualSnakeSpeak = snake.speak();
        String expectedSnakeSpeak = "hiissss hiss hsssss";

        assertTrue(actualSnakeSpeak.contains("hiss"));
        assertSame(expectedSnakeSpeak, actualSnakeSpeak);
    }
}