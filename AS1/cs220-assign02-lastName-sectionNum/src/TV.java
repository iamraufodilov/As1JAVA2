import java.io.FileWriter;
import java.io.IOException;

abstract class TV implements Logger {
	int currentChannel;
	int currentVolume;
	String modelName;
	
	public TV(String modelName) {
		this.currentChannel = 2;
		this.currentVolume = 10;
		this.modelName = modelName;
	}
	
	public void incChannel() {
		String message = "";
		if (currentChannel <=49) {
			currentChannel += 1;
			message = "increasing channel to " + String.valueOf(currentChannel);
			writeToLogFile(message);
		}
		else {
			message = "cannot increase channel";
			writeToLogFile(message);
		}
	}
	public void decChannel() {
		String message = "";
		if (currentChannel >= 1) {
			currentChannel -= 1;
			message = "decreasing channel to " + String.valueOf(currentChannel);
			writeToLogFile(message);
		}
		else {
			message = "cannot decrease channel";
			writeToLogFile(message);
		}
	}
	public void incVolume() {
		String message = "";
		if (currentVolume <= 49) {
			currentVolume += 1;
			message = "increasing volume to " + String.valueOf(currentChannel);
			writeToLogFile(message);
		}
		else {
			message = "cannot increase volume";
			writeToLogFile(message);
		}
	}
	public void decVolume() {
		String message = "";
		if (currentVolume >= 1) {
			currentVolume -= 1;
			message = "decreasing volume to " + String.valueOf(currentChannel);
			writeToLogFile(message);
		}
		else {
			message = "cannot decrease volume";
			writeToLogFile(message);
		}
	}
	public void changeChannel(int channel) {
		String message = "";
		if (channel>=1 & channel <=50) {
			currentChannel = channel;
			message = "changing channel to " + String.valueOf(channel);
			writeToLogFile(message);
		}
		else {
			message = "cannot change channel to " + String.valueOf(channel);
			writeToLogFile(message);
		}
	}
	
	// write to log file method from logger interface
	public void writeToLogFile(String message) {
		 try {
	            FileWriter writer = new FileWriter("/cs220-assign02-lastName-sectionNum/src/modelTV.txt", true);
	            writer.write(message);
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public String toString() {
		return "TV [currentChannel=" + currentChannel + ", currentVolume=" + currentVolume + ", modelName=" + modelName
				+ "]";
	}
}