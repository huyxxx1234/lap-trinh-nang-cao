package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public int add(int left, int right) {
        LOGGER.info("Adding operands left={} right={}", left, right);
        return left + right;
    }

    public static void main(String[] args) {
        LOGGER.info("Cache demo started");
        int result = new App().add(2, 3);
        LOGGER.info("2 + 3 = {}", result);
    }
}
