package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void classifiesNegativeZeroAndPositiveValues() {
        App app = new App();
        assertEquals(-1, app.classify(-2));
        assertEquals(0, app.classify(0));
        assertEquals(1, app.classify(2));
    }
}
