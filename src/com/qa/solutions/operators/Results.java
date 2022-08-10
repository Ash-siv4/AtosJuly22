package com.qa.solutions.operators;

public class Results {

	// A person takes 3 exams in college, Physics,
	// Chemistry, and Biology, each exam has a
	// maximum of 150 marks. When all the exam
	// marks have been added together, we can find
	// the overall percentage that the person has got
	// by multiplying their score by 100 and then
	// dividing by 450.
	//
	// 1.
	// Create the results class, this class has 5
	// variables, Physics, Chemistry, and
	// Biology, total and percentage. This class
	// should also have 2 methods:
	//
	// Method 1 - displays the results that
	// the person got for each exam and
	// then the total mark. Try to make the
	// output neat and bespoke for each exam.
	// Method 2 - which finds and displays
	// the percentage that the person
	// received for the exams overall.
	int Physics;
	int Chemistry;
	int Biology;
	int total;
	int percentage;

	public String method1(int phy, int chem, int bio) {
		Physics = phy;
		Chemistry = chem;
		Biology = bio;
		System.out.println("Physics mark: " + Physics);
		System.out.println("Chemistry mark: " + Chemistry);
		System.out.println("Biology mark: " + Biology);
		total = Physics + Chemistry + Biology;
		String t = "Total mark: " + total;
		return t;
	}

	public String method2() {
		percentage = (total * 100) / 450;
		return "Percentage total: " + percentage + "%";
	}
}
