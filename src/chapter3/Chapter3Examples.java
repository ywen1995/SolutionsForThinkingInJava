/* *
 * Selected examples for Chapter 3 for "Thinking in Java (2nd Edition)".
 * Codes originally created by Bruce Eckel, re-written by ywen.
 * Feb 2020.
 * */
package chapter3;

import java.util.*;

class Chapter3Examples{
	
	public static void main(String args[]) {
		

		C03ArithmeticOperatorPractice p1 = new C03ArithmeticOperatorPractice ();
		C03LabelPractice p2 = new C03LabelPractice();
		
		// Chapter 3, arithmetic operator practice.
		p1.c03ArithmeticOperatorPracticeMain();
		
		// Chapter 3, label practice.
		p2.c03LabelPracticeMain();
		return;
	}
}

class C03ArithmeticOperatorPractice{

	public static void prt(String s) {
		System.out.println(s);
	}
	
	public void pInt(String s, int i) {
		System.out.println(String.format("%s = %d", s, i));
	}
	public void pFlt(String s, float f) {
		System.out.println(String.format("%s = %f", s, f));
	}
	
	
	//main function in the book example. 
	public void c03ArithmeticOperatorPracticeMain() {
		
		// Part 1: int operations.
		Random rand = new Random();
		int tmp = 0;
		int ia = rand.nextInt()%100; 
		int ib = rand.nextInt()%100;
		
		// print all operands.
		pInt("a", ia);
		pInt("b", ib);
		tmp = ia + ib; pInt("a + b", tmp);
		tmp = ia - ib; pInt("a - b", tmp);
		tmp = ia * ib; pInt("a * b", tmp);
		tmp = ia / ib; pInt("a / b", tmp);
		tmp = ia & ib; pInt("a % b", tmp);
		ia &= ib; pInt("a &= b, a", ia);
		
		// Part 2; float operations.
		float tmpf = 0;
		float fa = rand.nextFloat();
		float fb = rand.nextFloat();
		
		// print all operands.
		pFlt("a",fa);
		pFlt("b",fb);
		tmpf = fa + fb; pFlt("a + b", tmpf);
		tmpf = fa - fb; pFlt("a - b", tmpf);
		tmpf = fa * fb; pFlt("a * b", tmpf);
		tmpf = fa / fb; pFlt("a / b", tmpf);
		
		// some special operands
		fa += fb; pFlt("a += b, a", fa);
		fa -= fb; pFlt("a -= b, a", fa);
		fa *= fb; pFlt("a *= b, a", fa);
		try {
			fa /= fb; pFlt("a /= b, a", fa);
		}catch(Exception e) {
			System.err.println("b cannot be 0!");
			return;
		}
		System.out.println("All operand tests have been done.");
		return;
	}
}

/** Practice for labels: e.g., outer loop, inner loop, continue outer/inner, break outer/inner.*/
class C03LabelPractice{
	
	public void c03LabelPracticeMain() {
		
		int i = 0;
		int k = 0;
		
	outer:
		//i = 0; //A mistake for rookies! labels cannot have following statements.
		for(;k<10;k++) {
		inner:
			for(;i<10;i++) {
				prt("k = "+ k);
				if(i==3) {
					prt(i + "continue.");
					continue;
				}
				if(i==5) {
					prt(i++ + "break.");
					break;
				}
				if(i==7) {
					prt(i + "break inner");
					i++; //otherwise will infinite loop right here.
					break inner;
				}
				if(i==9) {
					prt(i + "continue outer try.");
					if(k <= 2) {
						i = 0;
						continue outer;
					}
					break outer;
				}
				else {
					prt(Integer.toString(i));
				}
			}	
		}
		
	}
	
	public static void prt(String s) {
		System.out.println(s);
	}
}