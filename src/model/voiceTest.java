package model;

import javax.script.ScriptException;
import java.util.Scanner;


/* This class is a test class specifically to debug voiceListener. 
 * I tested and will be testing better and more efficient ways of
 * handling exceptions
 * 
 */
public class voiceTest {
	
	// voiceListener object
	private voiceListener p;
	
	// Store expression
	private String s;
	
	// testcase option
	String option;
	
	// Scanner
	private Scanner scnr;
	
	public voiceTest() {
		scnr = new Scanner(System.in);
		
		System.out.println("Enter an expression: ");
		this.s = scnr.nextLine();
		
		System.out.println("\nWhich option?:");
		option = scnr.nextLine();
		
		switch(option) {
			case "1":
				testCase();
				break;
			case "2":
				testCase2();
				break;
			case "3":
				testCase3();
				break;
		}
	}

	public voiceTest(String s) {
		this.s = s;
		
		testCase();
	}
	
	public void testCase() {
		
		// Test of voiceListener.
		new voiceListener(s);
		System.out.println();
		if(!s.equals("0")) {
			new voiceTest();
		}
		else {
			System.out.println("Test ended");
			System.exit(0);
		}
	}
	
	public void testCase2() {

		new voiceListener(s);
		if(!s.equals("0")) {
			new voiceTest();
		}
		else {
			System.out.println("Test ended");
			System.exit(0);
		}
	}
	
	// test class instance access to methods
	public void testCase3() {
		p = new voiceListener(s);
		String[] split = p.split(s);
		
		for(String s : split) System.out.print(s + " | ");
	}
	
}
