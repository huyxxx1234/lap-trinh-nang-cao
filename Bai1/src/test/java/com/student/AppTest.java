package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AppTest {
    private final App mathUtils = new App();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(4, mathUtils.subtract(7, 3));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(12, mathUtils.multiply(3, 4));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(2.5, mathUtils.divide(5.0, 2.0), 0.0001);
    }

    @Test
    void throwsWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(10.0, 0.0));
    }
}
