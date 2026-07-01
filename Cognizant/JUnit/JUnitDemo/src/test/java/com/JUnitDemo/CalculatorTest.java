package com.JUnitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {


	    @Test
	    public void testAddition() {
	        Calculator calculator = new Calculator();
	        assertEquals(30, calculator.add(10, 20));
	    }

	    @Test
	    public void testSubtraction() {
	        Calculator calculator = new Calculator();
	        assertEquals(10, calculator.subtract(20, 10));
	    }

	    @Test
	    public void testMultiplication() {
	        Calculator calculator = new Calculator();
	        assertEquals(200, calculator.multiply(10, 20));
	    }

	    @Test
	    public void testDivision() {
	        Calculator calculator = new Calculator();
	        assertEquals(2, calculator.divide(20, 10));
	    }
}
