# Voice Over

Oasys Okubo

2018-4-30

This project is a Voice Recognition and Synthesizer that allows for users to speak natural english and receive audible feedback on what the user said based on the current words in the grammar file (dictionary).

## Installation

Install this module by typing into your terminal:
```bash
git clone https://github.com/oasysokubo/Speech-interpretation-and-recognition.git
```

## Usage
A few modules/packages are used in this project:
[CMUSphinx](https://cmusphinx.github.io) - speech recognition toolkit

[FreeTTS](https://freetts.sourceforge.io) - speech synthesizer api 

Sources in this project:
* VoiceListener.java - takes in speech from Main and executes specific command
* VoiceDictation.java - voice recognition system
* VoiceSynthesizer.java - a voice synthesizer able to give linguistic feedback to users

## Development
- Master branch contains the voice recognition api along with a voice synthesizer 
- voice_assist branch contains an unfinished virtual assistant / hands-free computing application, which
needs more varieties of commands and functionalities.

## License
[MIT](https://choosealicense.com/licenses/mit/)
