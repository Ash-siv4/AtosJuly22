package com.qa.solutions.iteration;

public class Flowcharts2 {

	// 1.
	// Recreate the following flowchart as a
	// project.

	public void flow1() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}

	// 2.
	// Recreate the following flowchart as a
	// project.

	public void flow2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-" + A);
			} else {
				System.out.println("*" + A);
			}
		}
	}

	// 3.
	// Create a method that can print out the
	// numbers 1-10 10 times each.

	public void flow3() {
		for (int num = 1; num <= 10; num++) {
			for (int rep = 0; rep < 10; rep++) {
				System.out.println(num);
//				System.out.println(num + " : "+ rep);
			}
		}
	}

	// 4.
	// If you have used a while()-loop at any
	// point in these exercises, replace them
	// with for()-loops. Remember you should
	// use a for()-loop when you know when
	// the iteration should end.

	// 5.
	// Create a method to print the numbers 1
	// to 10 as many times as the value of that
	// number.
	// For example; you will print 1 once, and 10
	// ten times.

	public void flow4() {
		for (int num = 1; num <= 10; num++) {
			for (int rep = 0; rep < num; rep++) {
				System.out.println(num);
			}
		}
	}
}
