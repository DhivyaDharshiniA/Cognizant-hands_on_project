package com.JUnitDemo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        if (a > b)
            return a - b;
        else
            return b - a;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0)
            return a / b;
        else
            return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10, 20));
        System.out.println("Subtraction: " + calculator.subtract(20, 10));
        System.out.println("Multiplication: " + calculator.multiply(10, 20));
        System.out.println("Division: " + calculator.divide(20, 10));
    }
}