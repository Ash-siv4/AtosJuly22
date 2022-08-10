package com.qa.solutions.conditionals;

public class BlackJack {

	// 1.
	// Given 2 integer values greater than 0,
	// return whichever is closest to 21 without
	// going over 21. If they both go over 21
	// then return 0.
	//
	// play (10, 21) -> 21
	// play (20, 18) -> 20
	// play (1, 22) -> 1
	// play (22, 23) -> 0

	public int play(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (a > b && a <= 21) {
			return a;
		} else if (b > a && b <= 21)  {
			return b;
		}else {
			return a;
		}
	}
}
