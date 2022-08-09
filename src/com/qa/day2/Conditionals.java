package com.qa.day2;

public class Conditionals {

	public void weather(int temp) {
		if(temp>24 && temp>=30) {
			System.out.println("boiling");
		}else if(temp>24 && temp<30) {
			System.out.println("manageable");
		}else if(temp ==24) {
			System.out.println("ideal");
		}else {
			System.out.println("cold");
		}
		
		
//		if (temp > 24) {
//			System.out.println("hot");
//			if(temp>=30) {
//				System.out.println("boiling");
//			}else {
//				System.out.println("manageable");
//			}
//		} else if (temp == 24) {
//			System.out.println("ideal");
//		} else {
//			System.out.println("cold");
//		}
	}
	
	
	public void planets(String p) {
		switch(p.toLowerCase()) {
		case "mercury":
			System.out.println(1);
			break;
		case "venus":
			System.out.println(2);
			break;
		case "earth":
			System.out.println(3);
			break;
		case "mars":
			System.out.println(4);
			break;
		case "jupiter":
			System.out.println(5);
			break;
		case "saturn":
			System.out.println(6);
			break;
		case "uranus":
			System.out.println(7);
			break;
		case "neptune":
			System.out.println(8);
			break;
		case "pluto":
			System.out.println(9);
			break;
		default:
			System.out.println("not a planet");
		}
	}

}
