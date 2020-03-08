/* *
 * Selected examples for Chapter 3 for "Thinking in Java (2nd Edition)".
 * Codes originally created by Bruce Eckel, re-written by ywen.
 * Feb 2020.
 * */

package chapter3;

import java.util.*;
import java.lang.Math;
/*
 * Codes for different problems are packed into different classes. Comment out sections
 * you don't want in main function.
 */
public class Chapter3Problems {

	public static void main(String[] args) {	
		//Problem3And4.Problem3And4Main();
		//Problem6.Problem6Main();
		Problem9.Problem9Main();
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

class Problem6{
	
	public static void Problem6Main() {
		stringComparison("HelloWorld","HelloWorld");
		String a = "abc", b = "abc";
		stringComparison(a,b);
		stringComparison("","");
		stringComparison("Mary","Jason");
		stringComparison("Tuesday",null);
		stringComparison(null,"OK");	
		return;		
	}
	
	public static void stringComparison(String s1, String s2) {
		System.out.println(String.format("Now comparing %s with %s ...", s1, s2));
		// compare with ==
		System.out.println("Compare using \'==\':" + (s1==s2));		
		// compare with !=
		System.out.println("Compare using \'!=\':" + (s1!=s2));
		// compare with >= (commented for successful compilation)
		// System.out.println("Compare using \'>=\':" + (s1>=s2));
		// compare with <= (commented for successful compilation)
		// System.out.println("Compare using \'<=\':" + (s1<=s2));
		// compare with equals():
		try {
			System.out.println("Compare using \'equals()\':" + (s1.equals(s2)));
		}catch(Exception e) {
			System.err.println("Null string in s1 cannot be compared using equals.");
		}
		return;
	}	
}

class Problem9{
	
	/* This function will output **ALL** prime numbers in range [minInt, maxInt].
	 */
	public static void Problem9Main() {
		
		// case1: normal input
		primeSearch(16,37);
		// case2: minInt>maxInt
		primeSearch(17,15);
		// case3: minInt<0
		primeSearch(-11,11);
		// case4: maxInt>0
		primeSearch(13,-9);
		return;
	}
	
	public static void primeSearch(int minInt, int maxInt) {
		if(maxInt<1) {
			System.err.println("Illegal input: maxInput should be >= 1.");
			return;
		}
		int startInt = ((minInt<=1)? 2:minInt);
		
		// Two nested loops for judging prime number
		int havePrime = 0;
		outer:
		for(int curNum=startInt;curNum<=maxInt;curNum++) {
			// Reason for Math.sqrt(curNum) + 1: in case that the double yielded by Math.sqrt is smaller than desired actual int/double 
			for(int divisor=2;divisor<=Math.sqrt(curNum) + 1;divisor++) {
				if(curNum%divisor==0) {
					continue outer;
				}
			}
			System.out.println("Found a prime number: " + curNum);
			havePrime++;
		}
		
		//Summary for this interval.
		if(havePrime==0) {
			System.out.println(String.format("In [%d,%d], unfortunately there is no prime number.", minInt, maxInt));
		}
		else {
			System.out.println(String.format("In [%d,%d], we found %d prime numbers in total!", minInt, maxInt, havePrime));
		}
		return;
	}
}

