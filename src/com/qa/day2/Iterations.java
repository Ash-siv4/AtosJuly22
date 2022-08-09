package com.qa.day2;

public class Iterations {

	// LOOP - repeating for a certain number of times/ based on a condition,
	// e.g:printing out an array
	// 3 types of loops
	// - for
	// - while
	// - do-while
	
	//for-loop
	//for(initialisation;condition;iteration)
	public void forLoop(int end) {
		for(int count=0; count<=end; count++) {
			System.out.println(count);//0,1
		}
	}
	
	public void timesTable(int num) {
		for(int i=0; i<=num; i++) {
			int mul = i*num;
			System.out.println(i+"*"+num+"="+mul);
		}
	}
	
	
	//while loop - if you don't know the end point
	public void whileLoop() {
		System.out.println("-----While");
		int num = 3;
		while(num<3) {//3<3 -false
			num++;
			System.out.println(num);
		}
	}
	
	//do-while loop - same as while 
	//but it will execute once regardless of if the condition is true
	public void doWhile() {
		System.out.println("-----do-While");
		int num=3;
		do {
			num++;//4
			System.out.println(num);//4
		}while(num<3);//4<3
	}
	
	

}
