package com.qa.solutions.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise {

//	Try out using ArrayList yourself:
//
//		create a new ArrayList
//		add() several elements
//		print out the entire ArrayList
//		iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
//		get() specific elements
//		set() different elements
//		remove() elements
//		sort() the ArrayList (try this with several object types)
//		try using the reverse(), swap() and clear() methods.

	public void arrList() {
		// create array list
		ArrayList<String> disney = new ArrayList<>();
		// add elements
		disney.add("Mickey");
		disney.add("Minnie");
		disney.add("Pluto");
		disney.add("Daffy");
		disney.add("Donald");
		disney.add("Daisy");
		// print out
		System.out.println("List: " + disney);
		// iterate through to get each element
		// normal
		for (int index = 0; index < disney.size(); index++) {
			System.out.println(disney.get(index));
		}
		// enhanced
		for (String d : disney) {
			System.out.println(d);
		}
		//get specific
		System.out.println("Get 2: " + disney.get(2));
		System.out.println("Get 4: " + disney.get(4));
		//set 
		disney.set(5, "Goofy");
		System.out.println("Set 5: " + disney);
		//remove
		disney.remove(3);
		System.out.println("Remove 3: " + disney);
		//sort
		Collections.sort(disney);
		System.out.println("Sort: " + disney);
		//reverse, swap, clear
		Collections.reverse(disney);
		System.out.println("Reverse: " + disney);
		Collections.swap(disney, 0, 1);
		System.out.println("Swap 0,1: " + disney);
		disney.clear();
		System.out.println("Clear: " + disney);
	}

}
