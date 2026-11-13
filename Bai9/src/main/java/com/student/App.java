package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public int divide(int dividend, int divisor) {
        try {
            int result = dividend / divisor;
            LOGGER.info("Division completed dividend={} divisor={} result={}", dividend, divisor, result);
            return result;
        } catch (ArithmeticException exception) {
            LOGGER.error("Division failed dividend={} divisor={}", dividend, divisor, exception);
            throw exception;
        }
    }

    public static void main(String[] args) {
        LOGGER.info("Logging demo started");
        new App().divide(10, 2);
    }
}
