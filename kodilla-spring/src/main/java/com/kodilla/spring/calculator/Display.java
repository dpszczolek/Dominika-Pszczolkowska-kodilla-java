package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class Display {
    double val;

    public double displayValue (double val) {
        return val;
    }
}
