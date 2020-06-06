package com.barrysheehan.www;

/*
 * Iterative and recursive implementations of the Euclidean Algorithm, which
 * calculates the greatest common divisor of 2 input integers, a and b
 */

public class EuclideanAlgorithm {

	// Iterative implementation
	
	public int iterativeEuclid(int a, int b) {
		while (b != 0) { // Until the remainder of a / b is 0
			int temp = b; // Store value of b in temp variable
			b = a % b; // Store remainder of a / b in b
			a = temp; // Store value of temp in a
		}

		// When remainder of a / b reaches 0, a stores greatest common divisor
		return a;
	}

	// Recursive implementation
	
	public int recursiveEuclid(int a, int b) {
		if (b == 0) { // base case, remainder of a % b == 0
			return a; // a stores greatest common divisor
		} else {

			// Recursive call to recursiveEuclid() passes b and remainder of a / b
			return recursiveEuclid(b, a % b);
		}
	}

}
