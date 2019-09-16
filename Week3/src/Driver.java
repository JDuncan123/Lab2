//import java.util.*;
public class Driver {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		RecursiveMathLib recursionLibrary
		= new RecursiveMathLib();
		
		IterationMathLib iterationLibrary
		= new IterationMathLib();
		
		System.out.println("-----Recursion-----\n");
		runTestCode(recursionLibrary);
		
		System.out.println("-----Iteration-----\n");
		runTestCode(iterationLibrary);

	}
	public static void runTestCode(MathLib library) {
		System.out.println("GCD of 4,2 = "
				+library.gcd(4,2));
		
		System.out.println("Ackerman's of 4,0 = " + library.ack(0,1));
		
		System.out.println("Fibonacci of 7 = " + library.fib(7));
		
		System.out.println("Hanoi of 3 = " + library.hanoi(3));
	}
}
