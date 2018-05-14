package model;

import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

/**
 * VoiceSynthesizer class uses a Speech Synthesizer System, a text-to-speech 
 * system able to convert normal language text into speech in symbolic
 * linguistic representations like phonetic transcriptions into speech.
 * 
 * All rights go to Oracle's freetts-1 library.
 */
public class VoiceSynthesizer {
	
	// true if synthesizer has been launched
	private boolean VoiceSynthesizerThreadRunnning = false;
	
	public VoiceSynthesizer() {
		System.err.println("Error: Missing parameter");
		System.exit(1);
	}
	
	public VoiceSynthesizer(String s) {		
		
		if(s == null) {
			System.err.println("Nothing to say.");
			System.exit(1);
		}
		
		// Start VoiceSynthesizer
		textSpeech(s);
	}
	
	public void textSpeech(String speech) {
		try {
			
			if(!VoiceSynthesizerThreadRunnning) {
				// Set Property as Kevin Dictionary
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				
				// Register Engine
				Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
				
				// Create Synthesizer
				Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
				
				// Thread Runnning
				VoiceSynthesizerThreadRunnning = true;
				
				// Allocate Synthesizer
				synthesizer.allocate();
				
				// Resume Synthesizer
				synthesizer.resume();
				
				// Speak the speech text until queue is empty.
				synthesizer.speakPlainText(speech, null);
				synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
