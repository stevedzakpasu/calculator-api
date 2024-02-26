package com.stevedzakpasu.calculatorapi.controller;

import com.stevedzakpasu.calculatorapi.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calculator")
@RequiredArgsConstructor
/**
 * This class represents the controller for the Calculator API.
 */
public class CalculatorController {

    private final CalculatorService calculatorService;

    @PostMapping("/add")
    public double add(@RequestParam List<Double> values) {
        return calculatorService.add(values);
    }

    @PostMapping("/subtract")
    public double subtract(@RequestParam List<Double> values) {
        return calculatorService.subtract(values);
    }

    @PostMapping("/multiply")
    public double multiply(@RequestParam List<Double> values) {
        return calculatorService.multiply(values);
    }

    @PostMapping("/divide")
    public double divide(@RequestParam List<Double> values) {
        return calculatorService.divide(values);
    }

    @PostMapping("/addToMemory")
    public void addToMemory(@RequestParam double value) {
        calculatorService.addToMemory(value);
    }

    @PostMapping("/subtractFromMemory")
    public void subtractFromMemory(@RequestParam double value) {
        calculatorService.subtractFromMemory(value);
    }

    @GetMapping("/getMemory")
    public double getMemory() {
        return calculatorService.getMemory();
    }

    @PostMapping("/clearMemory")
    public void clearMemory() {
        calculatorService.clearMemory();
    }
}

