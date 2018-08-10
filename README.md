**voice_recognition** - voice recognition and synthesizer allows for users to speak natural english and receive audible feedback on what the user said based on the current words in the grammar file (dictionary).

Oasys Okubo

2018-4-30

**Info:**

- Master branch contains the voice recognition api along with a voice synthesizer 
- voice_assist branch contains an unfinished virtual assistant / hands-free computing application, which
needs more varieties of commands and functionalities.


**Sources:**

 * VoiceListener.java - takes in speech from Main and executes specific command

 * VoiceDictation.java - voice recognition system

 * VoiceSynthesizer.java - a voice synthesizer able to give linguistic feedback to users



**Built with:**

[CMUSphinx](https://cmusphinx.github.io) - speech recognition toolkit

[FreeTTS](https://freetts.sourceforge.io) - speech synthesizer api 
