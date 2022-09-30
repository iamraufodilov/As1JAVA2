
public class NebulaTV extends TV implements VoiceAssistant {

	public NebulaTV() {
		super("nebula");
	}
	
	// voice assistant method one
	public void saySomething(String speech) {
		String message = "";
		System.out.println(speech);
		message = "assistant: " + "\""+speech+"\"";
		writeToLogFile(message);
	}
	
	// voice assistant method two
	public void processSpeech(String speech) {
		
		// voice command 1
		if (speech.equals("increase channel")) {
			if (currentChannel<=49) {
				saySomething("increasing channel");
				incChannel();
			}
			else {
				saySomething("invalid channel, cannot increase");
			}
		}
		else if(speech.equals("decrease channel")) {
			if (currentChannel>=1) {
				saySomething("decreasing channel");
				decChannel();
			}
			else {
				saySomething("invalid channel, cannot decrease");
			}
		}
		else if(speech.equals("increase volume")) {
			if (currentVolume<=49) {
				saySomething("increasing volume");
				incVolume();
			}
			else {
				saySomething("invalid volume, cannot increase");
			}
		}
		else if(speech.equals("decrease volume")) {
			if (currentVolume>=1) {
				saySomething("decreasing volume");
				decVolume();
			}
			else {
				saySomething("invalid volume, cannot decrease");
			}
		}
		else if(speech.equals("change <int>")) {
			
			// how to get last word and turn it to number
			String[] parts = speech.split(" ");
			String lastWord = parts[parts.length - 1];
			
			int orderedNumber = Integer.parseInt(lastWord);
			
			if (orderedNumber >=0 & orderedNumber <=50) {
				saySomething("“changing channel to " + String.valueOf(orderedNumber));
				changeChannel(orderedNumber);
			}
			else {
				saySomething("invalid channel, cannot change");
			}
		}
		else {
			// FOR EXCEPTION
			String errorMessage = "";
			errorMessage = speech + "is not understood by the voice assistant for" + modelName + "tws";
			try {
				// I have to do something //----------------------------------------q
			}
			catch (SpeechNotUnderstoodException errorMessage1) {
		}
	}
}
	
}