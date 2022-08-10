package com.qa.solutions.arrays;

public class Numbers {

	// NOTE: THERE ARE OTHER WAYS TO SOLVE THE QUESTIONS, THIS IS ONE APPROACH YOU
	// CAN TAKE.

	// Question 1 - Create a method that takes a number 10-99, and adds the two
	// digits together
	public int add2Dig(int number) {// 28
		int val = 0;
		while (number >= 10 && number <= 99) {// 28
			number = number - 10;// 18 8
			val++;// 1 2
		}
		while (number >= 1 && number <= 9) {// 8
			number = number - 1;// 7 6 5
			val++;// 1 2 3
		}
		return val;
	}

	// NOTE: THE FOLLOWING CODE CAN BE FURTHER OPTIMISED(SHORTENED) - THINK ABOUT
	// HOW IT COULD BE DONE AND TRY IT OUT

	// Question 2 (& 3 & 4) - Create a second method that when given the number 1-99
	// returns a String representation of this number
	public String stringRep(int number) {
		String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		int countTh = 0;
		int countH = 0;
		int countT = 0;
		int countU = 0;
		String thous = "";
		String hundred = "";
		String ten = "";
		String unit = "";
		String out = "";

		if (number < 10) {
			out += units[number];
		} else if (number >= 10 && number < 20) {
			number = number - 10;
			out += teens[number];
		} else if (number >= 20 && number < 100) {
			while (number >= 10 && number <= 99) {
				number = number - 10;
				countT++;
			}
			ten = tens[countT];
			while (number >= 1 && number <= 9) {
				number = number - 1;
				countU++;
			}
			unit = units[countU];
			out = ten + " " + unit;
			// Question 3 - Expand on the method you wrote in Numbers 2 to allow the input
			// 1-999
		} else if (number >= 100 && number < 1000) {
			while (number >= 100 && number <= 999) {
				number = number - 100;
				countH++;
			}
			hundred = units[countH] + " hundred and ";
			while (number >= 10 && number <= 99) {
				number = number - 10;
				countT++;
			}
			ten = tens[countT];
			while (number >= 1 && number <= 9) {
				number = number - 1;
				countU++;
			}
			unit = units[countU];
			out = hundred + ten + " " + unit;
			// Question 4 - Expand the method you wrote in Numbers 2 to allow the input
			// 1-9999
		} else if (number >= 1000 && number < 10000) {
			while (number >= 1000 && number <= 9999) {
				number = number - 1000;
				countTh++;
			}
			thous = units[countTh] + " thousand ";
			while (number >= 100 && number <= 999) {
				number = number - 100;
				countH++;
			}
			hundred = units[countH] + " hundred and ";
			while (number >= 10 && number <= 99) {
				number = number - 10;
				countT++;
			}
			ten = tens[countT];
			while (number >= 1 && number <= 9) {
				number = number - 1;
				countU++;
			}
			unit = units[countU];
			out = thous + hundred + ten + " " + unit;
		}
		return out;
	}

	// NOTE: THE FOLLOWING CODE WORKS UPTO 29 - MODIFY IT TO PRINT ALL UPTO 100

	// Q5 - Use a for()-loop to print the numbers 1-100 in words
	public void one2hund() {
		String[] first = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] next = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String output = "";
		for (String i : first) {
			System.out.println(i);
		}
		for (int uni = 0, ten = 0; uni < 10; uni++) {
			output = next[ten] + " " + first[uni];
			System.out.println(output);
		}
	}
}
