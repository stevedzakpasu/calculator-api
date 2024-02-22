package com.stevedzakpasu.calculatorapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalculatorService {
    private double memory;

    public double add(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double subtract(List<Double> values) {
        double result = values.get(0);
//        for (int i = 1; i < values.size(); i++) {
//            result -= values.get(i);
//        }
        for(double num: values){
            result -= num;
        }
        return result;
    }

    public double multiply(List<Double> values) {
        return values.stream().reduce(1.0, (a, b) -> a * b);
    }

    public double divide(List<Double> values) {
        if (values.contains(0.0)) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double result = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            result /= values.get(i);
        }
        return result;
    }

    public void addToMemory(double value) {
        memory += value;
    }

    public void subtractFromMemory(double value) {
        memory -= value;
    }

    public void clearMemory() {
        memory = 0;
    }

    public double getMemory() {
        return memory;
    }
}