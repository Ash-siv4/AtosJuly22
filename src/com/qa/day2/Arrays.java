package com.qa.day2;

import java.util.ArrayList;

public class Arrays {

	// -------- Arrays -----------
	// collection of data
	
	//single-dimensional array
	int age = 24;
	int[] ageList = {24, 26, 34, 38};
	String[] letters = {"a", "b", "c"};
	// col 0   1   2   3
	//     24  26  34  38
	
	//multi-dimensional array
	int[][] nums = {{2, 4, 6, 8, 0},{1, 3, 5, 7, 9}};
	// col   0  1  2  3  4
	
	//row0   2  4  6  8  0
	//row1   1  3  5  7  9
	//[row][col]
	
	public void print() {
		//                   row, col
		System.out.println(nums[0][3]);//8
		System.out.println(ageList[0]);//24
		//normal for-loop
		System.out.println("normal for-loop");
		for(int index=0; index<ageList.length;index++) {
			System.out.println(ageList[index]);
		}
		//enhanced for-loop aka for-each loop
		System.out.println("enhanced for-loop");
		for(int i:ageList) {
			System.out.println(i);
		}
	}
	
	//-----------Array Lists
	
	//you can update an array list, so it is not fixed
	
	public void arrayList() {
		//create an instance of the arrayList class
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);//index of 0
		System.out.println(list);
		list.add(6);//index of 1
		list.add(43);//index of 2
		list.add(7);//index of 3
		System.out.println(list);
		System.out.println(list.get(3));//get the value at index 3 and print it
		System.out.println(list.size());
		list.remove(1);//removes whatever is at index 1 and shifts the array
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.clear();//deletes everything
		System.out.println(list);
	}
	
}
