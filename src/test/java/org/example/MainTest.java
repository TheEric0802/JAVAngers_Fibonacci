package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fibonacci_shouldReturn0_whenNIs1() {
        assertEquals(0, Main.fibonacci(1));
    }

    @Test
    void fibonacci_shouldReturn1_whenNIs2() {
        assertEquals(1, Main.fibonacci(2));
    }

    @Test
    void fibonacci_shouldReturn13_whenNIs8() {
        assertEquals(13, Main.fibonacci(8));
    }

    @Test
    void fibonacci_shouldReturn21_whenNIs9() {
        assertEquals(21, Main.fibonacci(9));
    }

}