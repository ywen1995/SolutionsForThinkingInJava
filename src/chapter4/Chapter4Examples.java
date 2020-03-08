/* *
 * Selected examples and test codes for Chapter 4 for "Thinking in Java (2nd Edition)".
 * Example codes originally created by Bruce Eckel, re-written by ywen.
 * Mar 2020.
 * */

package chapter4;

public class Chapter4Examples {

	public static void main(String[] args) {
		
		System.out.println("*****Starting Chapter4Examples*****");
		
		/*
		 * Testing variable initialization sequence and timing.
		 * From test results:
		 * (1) **ALL** static variables will be initialized once the class is loaded.
		 * (2) **ALL** non-static variables will be initialized once an objected is being created
		 * (3) **ALL* initializaton will happen before a function is being called.
		 */
		int unusedVar = Chapter4InitializationTryout.staticVar2.value;
		System.out.println("[Main] selected value:" + unusedVar);
		Chapter4InitializationTryout unusedDummyClass = new Chapter4InitializationTryout();
			
		System.out.println("*****Finishing Chapter4Examples*****");
		return;
	}

}

// Initialization tryout class
class Chapter4InitializationTryout{
	
	DummyClass nonStaticVar1 = new DummyClass(1);
	static DummyClass staticVar1 = new DummyClass(2);
	

	// Mess up the sequence in purpose - to observe the initialization sequence.
	Chapter4InitializationTryout(){
		System.out.println("[Tryout] Initialing...");
	}
	
	static DummyClass staticVar2 = new DummyClass(3);
	DummyClass nonStaticVar2 = new DummyClass(4);	
}

// A dummy class, print the input itself
class DummyClass{
	int value;
	DummyClass(int input){
		System.out.println("[DummyClass] Initializing " + input);
		value = input;
	}
}