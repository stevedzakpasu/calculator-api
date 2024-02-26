package com.stevedzakpasu.calculatorapi.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Getter
@Service
@RequiredArgsConstructor

/**
 * This class is used to configure the for the Calculator API.
 */
public class CalculatorService {
    // Memory variable to store values
    private double memory;

    // Method to add a list of values
    public double add(List<Double> values) {
        double sum = 0.0;
        // Loop through each value in the list and add it to the sum
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }

    // Method to subtract a list of values
    public double subtract(List<Double> values) {
        Iterator<Double> iterator = values.iterator();
        double result = iterator.next();
        // Loop through each value in the list and subtract it from the result
        while (iterator.hasNext()) {
            result -= iterator.next();
        }
        return result;
    }

    // Method to multiply a list of values
    public double multiply(List<Double> values) {
        double result = 1.0;
        // Loop through each value in the list and multiply it with the result
        for (Double value : values) {
            result *= value;
        }
        return result;
    }

    // Method to divide a list of values
    public double divide(List<Double> values) {
        // Check if the list contains zero and throw an exception if it does
        if (values.contains(0.0)) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        Iterator<Double> iterator = values.iterator();
        double result = iterator.next();
        // Loop through each value in the list and divide the result by it
        while (iterator.hasNext()) {
            double divisor = iterator.next();
            if (divisor == 0.0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            result /= divisor;
        }
        return result;
    }

    // Method to add a value to the memory
    public void addToMemory(double value) {
        memory += value;
    }

    // Method to subtract a value from the memory
    public void subtractFromMemory(double value) {
        memory -= value;
    }

    // Method to clear the memory
    public void clearMemory() {
        memory = 0;
    }

}