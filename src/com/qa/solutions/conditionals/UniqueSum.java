package com.qa.solutions.conditionals;

public class UniqueSum {

	// 1.
	// Given 3 integer values, return their sum. If one value is the same as another
	// value,
	// they do not count towards the sum. In other words, only return the sum of
	// unique numbers given.
	// Input(1, 2, 3) -> 6
	// Input(3, 3, 3) -> 0
	// Input(1, 1, 2) -> 2

	public int input(int x, int y, int z) {
		if (x == y && y == z && x == z) {
			return 0;
		} else if (x == y) {
			return z;
		} else if (y == z) {
			return x;
		} else if (x == z) {
			return y;
		} else {
			return x + y + z;
		}
	}
}
