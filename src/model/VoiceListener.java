package model;

import java.util.Arrays;
import java.util.List;

/*
 * voiceListener takes in the speech in String form from the main, speech
 * analysis class and executes specific commmand based on unique statement
 */
public class VoiceListener {

	// Math
	Math math;

	// Store Speech
	private String speech;
	
	// String Formatted output
	private String output;
	

	/**
	 * random expressions
	 */
	String[] unknown = { "What do you mean by", "What's", "What is", "What about" };
	String[] greet = { "hey", "hi", "hello", };

	/**
	 * Constructor
	 * 
	 * @param speech
	 */
	public VoiceListener(String speech) {

		this.speech = speech;

		// call to analyze speech
		commandEx();

	}

	/**
	 * commandEx() analyzes String and executes unique command
	 * 
	 * @param s takes in String from parsed speech
	 */
	public void commandEx() {

		/**
		 * <math>
		 */
		if (speech.contains("divide") || speech.contains("multipl") || speech.contains("times")
				|| speech.contains("add") || speech.contains("plus") || speech.contains("minus")
				|| speech.contains("subtract")) {

			// call Math to calculate expression
			math = new Math(speech);

			// function calls Math class for calculation
			if (speech.contains("divide")) {
				output = String.format((math.getResult() == -1) ? "" : "%d / %d = %.2f\n", math.getR1(), math.getR2(),
						math.getResult());
			} else if (speech.contains("multipl") || speech.contains("times")) {
				output = String.format((math.getResult() == -1) ? "" : "%d x %d = %.2f\n", math.getR1(), math.getR2(),
						math.getResult());
			} else if (speech.contains("add") || speech.contains("plus")) {
				output = String.format((math.getResult() == -1) ? "" : "%d + %d = %.2f\n", math.getR1(), math.getR2(),
						math.getResult());
			} else if (speech.contains("minus") || speech.contains("subtract")) {
				output = String.format((math.getResult() == -1) ? "" : "%d - %d = %.2f\n", math.getR1(), math.getR2(),
						math.getResult());
			}
		}
		/**
		 * </math>
		 */

		/**
		 * <feelings>
		 */

		/**
		 * </feelings>
		 */

		/**
		 * <random>
		 */
		else if (speech.contains("test")) {
			output = new String("There is nothing to test.");
		}
		/**
		 * </random>
		 */

		/**
		 * <command>
		 */
		else if (speech.contains("help")) {

		} else if (speech.contains("quit")) {
			System.out.println("Goodbye");
			System.exit(0);
		}
		/**
		 * </command>
		 */
		
		
		/**
		 * Output Data
		 */
		System.out.println(output);
	}

}
