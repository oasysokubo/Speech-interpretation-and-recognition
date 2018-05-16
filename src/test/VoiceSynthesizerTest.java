package test;

import java.util.Scanner;

import api.VoiceSynthesizer;

public class VoiceSynthesizerTest {

	// VoiceSynthesizer
	private VoiceSynthesizer voiceSyn;

	// Scanner
	private Scanner in = new Scanner(System.in);

	// Input
	private String input;

	public VoiceSynthesizerTest() {
		synthesizerTest();
	}

	public void synthesizerTest() {

		System.out.print("Enter speech: ");
		input = in.nextLine();

		new VoiceSynthesizer(input);

		if (!input.equals("done")) {
			synthesizerTest();
		}

	}

}
