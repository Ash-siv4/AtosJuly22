package com.qa.solutions.conditionals;

public class FizzBuzz {

	// 1.
	// Create a method which returns 'Fizz' for
	// multiples of three and 'Buzz' for the
	// multiples of five.
	// 2.
	// Return 'FizzBuzz' for numbers which are
	// multiples of both three and five.
	// 3.
	// Return the input number for numbers
	// that are neither.

	public String fizzBuzz(int number) {
		if (number % 3 == 0 & number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else {
			return "Input number:" + number;

		}
	}
}
