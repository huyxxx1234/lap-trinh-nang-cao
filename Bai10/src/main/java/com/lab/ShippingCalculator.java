package com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShippingCalculator.class);

    public double calculate(double weight, String type) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        if ("EXPRESS".equals(type)) {
            double total = weight * 5000 + 20000;
            LOGGER.info("Calculated EXPRESS shipping weight={} total={}", weight, total);
            return total;
        }
        if ("STANDARD".equals(type)) {
            double total = weight * 3000;
            LOGGER.info("Calculated STANDARD shipping weight={} total={}", weight, total);
            return total;
        }
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
