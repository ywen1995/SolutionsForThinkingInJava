/* Selected examples for Chapter 3 for "Thinking in Java (2nd Edition)".
 * Codes originally created by Bruce Eckel, re-written by ywen.
 * Feb 2020.
 * */
package chapter3;

/*
 * Codes for different problems are packed into different classes. Comment out sections
 * you don't want in main function.
 */
public class Chapter3Problems {

	public static void main(String[] args) {
		
		Problem3And4.Problem3And4Main();
	}
	
}

/*
 * Problem 3 and 4 together. Changed ternary and alternative methods.
 */
class Problem3And4{
	
	public static void Problem3And4Main() {
		for(int i=1;i<=100;i++) {
			switch(i%2){
			case 0: System.out.println(ternary(i));break;
			case 1: System.out.println(alternative(i));break;
			default: System.out.println("How is it possible?");
			}
		}
		return;
	}
	
	public static String ternary(int input) {
		return (input<50)? Integer.toString(input) : input + " becomes larger!";
	}
	
	public static String alternative(int input) {
		if(input<50) {
			return input + " still small :(";
		}else {
			return Integer.toString(input);
		}
	}
	
}