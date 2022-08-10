package com.qa.solutions.arrays;

public class Arrays {

	// 1.
	// Create an array that will hold 10 integer
	// values, populate the array with values,
	// then call and output each element.
	int[] vals = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void print() {
		System.out.println("normal for-loop");
		for (int index = 0; index < vals.length; index++) {
			System.out.println(vals[index]);
		}
		System.out.println("enhanced for-loop");
		for (int i : vals) {
			System.out.println(i);
		}
	}

	// 2.
	// Create a for loop that populates an
	// integer array with values, outputting
	// them at each iteration.
	// Then create another loop that iterates
	// through the array, changing the values at
	// each point to equal itself times 10,
	// outputting them at each iteration.

}
