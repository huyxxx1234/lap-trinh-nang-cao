package com.student;

import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public int add(int left, int right) {
        return left + right;
    }

    public static void main(String[] args) {
        int result = new App().add(2, 3);
        LOGGER.info("Executable Maven JAR started successfully! 2 + 3 = " + result);
    }
}
