package test;

import javax.script.ScriptException;

import model.ArithmeticAnalysis;
import model.VoiceListener;

import java.util.Scanner;

/* This class is a test class specifically to debug VoiceListener. 
 * I tested and will be testing better and more efficient ways of
 * handling exceptions
 * 
 */
public class VoiceListenerTest {

	// voiceListener object
	private VoiceListener p;

	// Math object
	private Math math;

	// Store expression
	private String s;

	// testcase option
	String option;

	// Scanner
	private Scanner scnr;

	public VoiceListenerTest() {
		scnr = new Scanner(System.in);

		System.out.println("Enter an expression: ");
		this.s = scnr.nextLine();
		
		testCase();

	}

	public VoiceListenerTest(String s) {
		this.s = s;

		testCase();
	}

	public void testCase() {

		// Test of voiceListener.
		new VoiceListener(s);
		System.out.println();
		if (!s.equals("0")) {
			new VoiceListenerTest();
		} else {
			System.out.println("Test ended");
			System.exit(0);
		}
	}

}
