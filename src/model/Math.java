package model;

import java.util.Arrays;
import java.util.List;

/**
 * Math calculation class which covers basic arithmetic calculations
 */
public class Math {

	// store speech
	private String s;

	private String[] splitEqn;

	private double result;

	// numParse results
	private int r1;
	private int r2;
	

	/**
	 * allowed numbers
	 */
	List<String> allowedStrings = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred",
			"thousand", "million", "billion", "trillion");

	/**
	 * Math expression possibilities
	 */
	String[] mathEx = { "plus", "add", "addition", "added by", "added", "minus", "subtract", "subtract by",
			"subtracted", "multiplication", "multiply", "multiplied by", "times", "division", "divide", "divided by",
			"divided" };

	/**
	 * Default Constructor with no parameter
	 */
	public Math() {
		System.err.println("Error: No speech parameter.");
	}

	/**
	 * Constructor with parameter
	 * 
	 * @param s
	 *            is speech
	 */
	public Math(String s) {
		this.s = s;
		calculate();
	}

	/**
	 * @return a calculated two variable equation
	 * 
	 * @param s
	 *            is the string of the speech
	 */
	public void calculate() {

		for (int i = 0; i < mathEx.length; i++) {

			if (s.contains(mathEx[i])) {

				if (s.contains("plus") || s.contains("add"))
					result = math(split(s, mathEx[i]), "+");

				else if (s.contains("divide"))
					result = math(split(s, mathEx[i]), "/");

				else if (s.contains("multipl") || s.contains("times"))
					result = math(split(s, mathEx[i]), "*");

				else if (s.contains("minus") || s.contains("subtract"))
					result = math(split(s, mathEx[i]), "-");
			}
		}
	}

	/*
	 * @return array of split speech
	 * 
	 * @param s takes in speech and v is the specific split point value
	 */

	public String[] split(String s, String v) {

		if (s != null && s.length() > 0) {
			splitEqn = s.split(v);
			return splitEqn;
		} else {
			System.err.println("Error: Unable to split null String");
			System.exit(1);
		}

		return null;
	}

	/*
	 * @return array of split speech
	 * 
	 * @param s takes in speech
	 */

	public String[] split(String s) {

		if (s != null && s.length() > 0) {
			splitEqn = s.split("\\s+");
			return splitEqn;
		} else {
			System.err.println("Error: Unable to split null String");
			System.exit(1);
		}

		return null;
	}

	/*
	 * calculates based on unique statement, only able to calculate with two
	 * variables currentlyt
	 * 
	 * 
	 * @return calculated math equation
	 * 
	 * @param m takes in a splitted array of the speech, v is a specific arithmetic
	 * property
	 */

	public double math(String[] split, String v) {

		boolean isValidInput = true;

		// result of solved eqation
		double result = -1;

		if (split.length != 2) {
			System.err.println("Error: equation does not contain enough information");
			isValidInput = false;

		}

		/*
		 * Implement a checker for wrong input*
		 * 
		 * 
		 * 
		 * for (String str : split) { if (!allowedStrings.contains(str)) { isValidInput
		 * = false; //System.err.printf("Invalid word found: %s\n", str);
		 * System.err.println(split[0] + " " + split[1]); break; } }
		 */

		if (isValidInput) {
			// call getIndex see where key word occurs.
			// Analyze unique statement and prompt for correct operation
			// create the variables for the first number. Preferably a for loop which loops
			// until and skips the getIndex value.
			// Another for loop for the second number after unique statement.

			r1 = numParse(split[0]);
			r2 = numParse(split[1]);

			if (v.equals("+")) {
				result = r1 + r2;
			} else if (v.equals("-")) {
				result = r1 - r2;
			} else if (v.equals("/")) {
				result = (double) r1 / (double) r2;
			} else if (v.equals("*")) {
				result = (double) r1 * (double) r2;
			}
		}
		return result;
	}

	/*
	 * @return parsed numbers
	 * 
	 * @param is the split speech
	 */
	public int numParse(String str) {

		// parsed number variables
		int result = 0;
		int finalResult = 0;

		if (str.contains("zero")) {
			result += 0;
		}
		if (str.contains("one")) {
			result += 1;
		}
		if (str.contains("two")) {
			result += 2;
		}
		if (str.contains("three")) {
			result += 3;
		}
		if (str.contains("four")) {
			result += 4;
		}
		if (str.contains("five")) {
			result += 5;
		}
		if (str.contains("six")) {
			result += 6;
		}
		if (str.contains("seven")) {
			result += 7;
		}
		if (str.contains("eight")) {
			result += 8;
		}
		if (str.contains("nine")) {
			result += 9;
		}
		if (str.contains("ten")) {
			result += 10;
		}
		if (str.contains("eleven")) {
			result += 11;
		}
		if (str.contains("twelve")) {
			result += 12;
		}
		if (str.contains("thirteen")) {
			result += 13;
		}
		if (str.contains("fourteen")) {
			result += 14;
		}
		if (str.contains("fifteen")) {
			result += 15;
		}
		if (str.contains("sixteen")) {
			result += 16;
		}
		if (str.contains("seventeen")) {
			result += 17;
		}
		if (str.contains("eighteen")) {
			result += 18;
		}
		if (str.contains("nineteen")) {
			result += 19;
		}
		if (str.contains("twenty")) {
			result += 20;
		}
		if (str.contains("thirty")) {
			result += 30;
		}
		if (str.contains("forty")) {
			result += 40;
		}
		if (str.contains("fifty")) {
			result += 50;
		}
		if (str.contains("sixty")) {
			result += 60;
		}
		if (str.contains("seventy")) {
			result += 70;
		}
		if (str.contains("eighty")) {
			result += 80;
		}
		if (str.contains("ninety")) {
			result += 90;
		}
		if (str.contains("hundred")) {
			result *= 100;
		}
		if (str.contains("thousand")) {
			if (result == 0) {
				result += 1000;
			} else {
				result *= 1000;
				finalResult += result;
				result = 0;
			}
		}
		if (str.contains("million")) {
			if (result == 0) {
				result += 1000000;
			} else {
				result *= 1000000;
				finalResult += result;
				result = 0;
			}
		}
		if (str.contains("billion")) {
			if (result == 0) {
				result += 1000000000;
			} else {
				result *= 1000000000;
				finalResult += result;
				result = 0;
			}
		}
		if (str.contains("trillion")) {
			if (result == 0) {
				result += 1000000000000L;
			} else {
				result *= 1000000000000L;
				finalResult += result;
				result = 0;
			}
		}

		finalResult += result;
		result = 0;
		return finalResult;
	}

	// Getters and Setters

	/*
	 * @return index of where str occures in array
	 * 
	 * @param s is the split speech array and str is searched
	 */
	public int getIndex(String[] s, String str) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(str))
				return i;
		}
		return 0;
	}

	public double getResult() {
		return result;
	}

	public int getR1() {
		return this.r1;
	}

	public int getR2() {
		return this.r2;
	}

	/*
	 * @return String representation of result
	 */
	public String toString() {
		return this.result + "";
	}

}
