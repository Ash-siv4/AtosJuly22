package com.qa.solutions.operators;

public class Calculator {
	// 1.
	// Create a method that accepts two integers as input, then
	// returns an integer that is the sum of these two parameters.
	// (Addition)
	public int add(int a, int b) {
		return a + b;
	}

	// 2.
	// Create the following additional three
	// methods that each take two parameters:
	// Multiplication - which takes two
	// numbers and returns the product.
	// Subtraction - which takes two
	// numbers, then returns the result of
	// the subtraction.
	// Division - which takes two numbers,
	// then returns the result of the division.
	public int sub(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	// 3.
	// Your division method may have returned
	// the wrong result; This is called a rounding
	// error and is quite common in most
	// languages. this is because we were using
	// ints rather than doubles. Modify the
	// division method so that it takes Double
	// parameters and then return a Double, if
	// not already.
	public double divide2(double a, double b) {
		return a / b;
	}

}
