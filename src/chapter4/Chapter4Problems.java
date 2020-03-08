/* *
 * Selected practices for Chapter 4 for "Thinking in Java (2nd Edition)".
 * Codes created by ywen.
 * Mar 2020.
 * */

package chapter4;

import java.util.*;

public class Chapter4Problems {

    public static void main(String[] args) {

        Object testObject;
        // Problem 1 to 4
        Problem1To4.localMain();
		
        // Problem 9 to 10
        testObject = new Problem9To10();
        ((Problem9To10) testObject).localMain(); // Need a type conversion here since there's no "localMain" method in class "Object".
			
        return;
	}
}

/*
 * Problem 1 to 4 
 * Problem 1 and 2 are simply constructing the "Problem1Class".
 * Problem 3 and 4 as in localMain().
 */
class Problem1To4 {

	// Local main function
    public static void localMain() {

        System.out.println("*****Starting Problem 3*****");
        Problem1Class[] problem1ClassObjects = new Problem1Class[2];
        System.out.println("*****Finishing Problem 3*****");
        System.out.println("*****Starting Problem 4*****");
        problem1ClassObjects = new Problem1Class[] { 
            new Problem1Class(), 
		    new Problem1Class("Print me!") 
        };
        System.out.println("*****Finishing Problem 4*****");

        return;
    }
}

class Problem1Class {

    Problem1Class() {
        System.out.println("[Problem1Class] Printing something :D");
    }

    Problem1Class(String inputMessage) {
        System.out.println("[Problem1Class] Printing input message:" + inputMessage);
    }
}

/*
 * Problem 9 to 10.
 */
class Problem9To10 {
    
    // Local main function
    public void localMain() {
        p9function();
    }
    
    Problem9To10(){
        this(3);
        System.out.println("[Problem 10] I'm the orignal constructer :D");
        
    }
    
    Problem9To10(int id){
        System.out.println("[Problem 10] I am the \'real\' original constructer with ID " + id);
    }
    
    private void p9function() {
        System.out.println("[Problem 9] I'm the orignal p9function.");
        this.p9function(1);
        p9function(2);
    }
    
    private void p9function(int id) {
        System.out.println("[Problem 9] I am the \'real\' original p9function with ID " + id);
    }
}

