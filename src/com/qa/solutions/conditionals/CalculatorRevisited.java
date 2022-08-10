package com.qa.solutions.conditionals;

public class CalculatorRevisited {

	// 1.
	// Edit the division method in the Calculator
	// class, the sum should only execute if the
	// first parameter is smaller than the
	// second, otherwise it prints out a message
	// saying that the division cannot be
	// performed.

	public String divide3(double a, double b) {
		if (a < b) {
			return "Result:" + a / b;
		}
		return "Division cannot be performed";
	}

}
