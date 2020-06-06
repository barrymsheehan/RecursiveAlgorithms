package com.barrysheehan.www;

/*
 * Iterative and recursive methods which return the reverse of an input String,
 * string
 */

public class ReverseString {

	// Iterative implementation

	public String iterativeReverse(String string) {
		StringBuilder sb = new StringBuilder();

		// Beginning with the last character in the input String
		for (int i = string.length() - 1; i >= 0; i--) {
			sb.append(string.charAt(i)); // Append character to start of StringBuilder

			// Append "|" character after each character until i reaches 0
			if (i > 0) {
				sb.append("|");
			}
		}

		return sb.toString();
	}

	// Recursive implementation

	public String recursiveReverse(String string) {
		if (string.length() <= 1) { // base case
			return string;
		} else {

			// Recursive call to recursiveReverse() passes substring beginning at second
			// character of input String
			return recursiveReverse(string.substring(1)) + "|" + string.charAt(0);
		}
	}

}
