package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void dividesNumbersAndWritesLogFile() {
        assertEquals(5, new App().divide(10, 2));
        assertTrue(Files.exists(Path.of("logs", "application.log")));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> new App().divide(10, 0));
    }
}
