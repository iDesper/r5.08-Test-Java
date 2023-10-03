package com.nieto.calculator;

public class Calculator {
    public int add ( int opG,int opD)
    {
        return opG+opD;
    }

    public int divide ( int opG, int opD)
    {
        try {
            return opG / opD;

        } catch (ArithmeticException e) {
            System.out.printf("On ne peut pas diviser par zero");
            return 0;
        }
    }
}
