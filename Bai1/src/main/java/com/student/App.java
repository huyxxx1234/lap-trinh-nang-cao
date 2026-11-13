package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public int add(int left, int right) {
        int result = left + right;
        LOGGER.info("Executed add({}, {}) -> {}", left, right, result);
        return result;
    }

    public int subtract(int left, int right) {
        int result = left - right;
        LOGGER.info("Executed subtract({}, {}) -> {}", left, right, result);
        return result;
    }

    public int multiply(int left, int right) {
        int result = left * right;
        LOGGER.info("Executed multiply({}, {}) -> {}", left, right, result);
        return result;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            LOGGER.error("Division by zero attempted with dividend={}", dividend);
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        double result = dividend / divisor;
        LOGGER.info("Executed divide({}, {}) -> {}", dividend, divisor, result);
        return result;
    }

    public static void main(String[] args) {
        LOGGER.info("MathUtils application started");
        App mathUtils = new App();
        int sum = mathUtils.add(2, 3);
        LOGGER.info("Sample calculation finished: sum={}", sum);
    }
}
