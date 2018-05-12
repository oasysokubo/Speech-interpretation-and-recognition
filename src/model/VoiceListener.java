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
	
	// VoiceSynthesizer
	VoiceSynthesizer voicesynthesizer;

	// Store Speech
	private String speech;
	
	// String Formatted output
	private String output;

	/**
	 * random expressions
	 */
	String[] unknown = { "what did you say?", "what?" };
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
		 * <greet>
		 */
		else if(speech.contains("hello") || speech.contains("hey") || speech.contains("hi")) {
			output = greet[0];
		}
		/**
		 * </greet>
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
		else if(speech.contains("open")) {
			if(speech.contains("safari")) new RunCommand("open /Applications/Safari.app");
			else if(speech.contains("text edit")) new RunCommand("open /Applications/textedit.app");
			else if(speech.contains("minecraft")) new RunCommand("open /Applications/Minecraft.app");
		}
		else if (speech.contains("help")) {
			output = "With what?";

		} else if (speech.contains("quit")) {
			new VoiceSynthesizer("Goodbye");
			System.exit(0);
		}
		/**
		 * </command>
		 */
		
		else {
			output = unknown[0];
		}
		
		
		/**
		 * Output Data
		 */
		//new VoiceSynthesizer(output);
	}

}
