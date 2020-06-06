package com.barrysheehan.www;

/*
 * Iterative and recursive methods which calculate the factorial of input, n
 */

public class Factorial {

	// Iterative implementation

	public long iterativeFactorial(int n) {
		int answer = 1;

		while (n > 1) { // Until n reaches 1
			answer *= n; // answer stores answer * n
			n--; // Decrement n
		}

		return answer;
	}

	// Recursive implementation

	public long recursiveFactorial(int n) {
		if (n <= 1) { // base case
			return 1;
		} else {

			// Recursive call to recursiveFactorial() passes n - 1
			return n * recursiveFactorial(n - 1);
		}
	}

}
