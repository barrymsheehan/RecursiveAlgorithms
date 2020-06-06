package com.barrysheehan.www;

/*
 * Iterative and recursive methods which calculate the nth value of the
 * Fibonacci sequence
 */

public class Fibonacci {

	// Iterative implementation

	public long iterativeFibonacci(int n) {
		int temp, n2 = 0, n1 = 1;

		for (int i = n; i > 2; i--) {
			temp = n2; // temp variable stores value of n2
			n2 = n1; // n2 stores value of n1
			n1 = n1 + temp; // n1 stores value of n1 + temp
		}

		return n2 + n1;
	}

	// Recursive implementation

	public long recursiveFibonacci(int n) {
		if (n <= 1) { // If n reaches 1 or lower
			return n; // Return n
		}

		// Binary recursive calls to the recursiveFibonacci method
		return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}

}
