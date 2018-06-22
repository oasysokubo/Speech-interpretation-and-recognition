# This project changes, 6/21:
# Delete ArithmeticAnalysis, change VoiceListener for only speech-to-text parsing
# RunCommand not needed, VoiceSynthesizer is optional at start
# Bring back **Main class** and maybe implement JavaFX interface. 


**voicer** - voice recognition and synthesizer allows for users to speak natural english voice commands and receive audible 
feedback

Oasys Okubo

2018-4-30


**Sources:**

 * Main.java - program launcher 

 * ArithmeticAnalysis.java - calculates math equation recognized by speech recognition

 * VoiceListener.java - takes in speech from Main and executes specific command

 * VoiceDictation.java - voice recognition system

 * VoiceSynthesizer.java - a voice synthesizer able to give linguistic feedback to users

 * RunCommand.java - a runtime class for performing computer system tasks


**Built with:**

[CMUSphinx](https://cmusphinx.github.io) - speech recognition toolkit

[FreeTTS](https://freetts.sourceforge.io) - speech synthesizer api 
