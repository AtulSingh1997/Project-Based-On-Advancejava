package com.lamdaexpresion;

public interface Student {
	@FunctionalInterface
	interface Calculator {
	    double calculate(double a, double b);
	}

	public class FunctionalCalculator {
	    public static void main(String[] args) {
	        // Addition
	        Calculator add = (a, b) -> a + b;
	        System.out.println("Addition: " + operate(5, 3, add));

	        // Subtraction
	        Calculator subtract = (a, b) -> a - b;
	        System.out.println("Subtraction: " + operate(5, 3, subtract));

	        // Multiplication
	        Calculator multiply = (a, b) -> a * b;
	        System.out.println("Multiplication: " + operate(5, 3, multiply));

	        // Division
	        Calculator divide = (a, b) -> {
	            if (b != 0) {
	                return a / b;
	            } else {
	                System.out.println("Cannot divide by zero.");
	                return Double.NaN; // Not a Number
	            }
	        };
	        System.out.println("Division: " + operate(5, 3, divide));
	    }

	    private static double operate(double a, double b, Calculator calculator) {
	        return calculator.calculate(a, b);
	    }
	}

}
