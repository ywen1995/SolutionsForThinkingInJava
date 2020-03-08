/* *
 * Practice for Chapter 2, Problem 9 for "Thinking in Java (2nd Edition)".
 * Codes created by ywen.
 * Feb 2020.
 * */


package chapter2;

import java.util.*;
 
class Chapter2Problem9{	
	
	public static void main(String args[]) {	
		// Initialization 
		AllTheColorsOfTheRainbow a0 = new AllTheColorsOfTheRainbow();
		AllTheColorsOfTheRainbow a1 = new AllTheColorsOfTheRainbow(2);
		AllTheColorsOfTheRainbow a2 = new AllTheColorsOfTheRainbow(4);
		
		// Test out prints.
		System.out.println(a0.intColor);
		System.out.println(a1.intColor);
		System.out.println(a2.changeColor(4));		
	}
}

class AllTheColorsOfTheRainbow{
	
	public int intColor;
	
	AllTheColorsOfTheRainbow() {
		intColor = 0;
	}
	
	AllTheColorsOfTheRainbow(int first){
		intColor = first;
	}
	
	// If the new color is the same with the old one, returns false; otherwise change and returns true.
	public boolean changeColor(int newColor) {
		if(newColor==intColor) {
			return false;
		}
		intColor = newColor;
		return true;
	}
	
}

