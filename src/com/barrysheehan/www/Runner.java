package com.barrysheehan.www;

/*
 * The Runner class contains a simple main method which creates an instance of
 * each iterative and recursive algorithm. Input values can be changed below to
 * change the output of the algorithms.
 */

public class Runner {

	public static void main(String[] args) {
		
		
		// Instantiate an object from each class
		EuclideanAlgorithm euclid = new EuclideanAlgorithm();
		Factorial fact = new Factorial();
		Fibonacci fib = new Fibonacci();
		ReverseString rev = new ReverseString();
		
		/*
		 * Calculate the result of each algorithm for specific inputs
		 * Change values here to affect the output of each algorithm
		 */
		
		// Euclidean Algorithm
		int iterativeEuclid = euclid.iterativeEuclid(1000, 26); // Iterative
		int recursiveEuclid = euclid.recursiveEuclid(1000, 26); // Recursive
		
		// Factorial
		long iterativeFact = fact.iterativeFactorial(5); // Iterative
		long recursiveFact = fact.recursiveFactorial(5); // Recursive
		
		// nth value of Fibonacci sequence
		long iterativeFib = fib.iterativeFibonacci(12); // Iterative
		long recursiveFib = fib.recursiveFibonacci(12); // Recursive
		
		// Reverse an input String
		String iterativeReversed = rev.iterativeReverse("This is a String."); // Iterative
		String recursiveReversed = rev.recursiveReverse("This is a String."); // Recursive
		
		// Output
		System.out.println("Euclidean Algorithm:");
		System.out.println("Iterative: " + iterativeEuclid);
		System.out.println("Recursive: " + recursiveEuclid);
		System.out.println("================================================================================\n");
		
		System.out.println("Factorial:");
		System.out.println("Iterative: " + iterativeFact);
		System.out.println("Recursive: " + recursiveFact);
		System.out.println("================================================================================\n");
		
		System.out.println("Fibonacci:");
		System.out.println("Iterative: " + iterativeFib);
		System.out.println("Recursive: " + recursiveFib);
		System.out.println("================================================================================\n");
		
		System.out.println("Reversed String:");
		System.out.println("Iterative: " + iterativeReversed);
		System.out.println("Recursive: " + recursiveReversed);
		System.out.println("================================================================================\n");
		
		
	}
}
