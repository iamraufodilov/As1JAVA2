
public abstract class Smartphone implements Logger, VoiceAssistant {
	String modelName;
	double batteryCapacity;
	double currentBattery;
	
	public Smartphone(String modelName, double batteryCapacity) {
		this.currentBattery = batteryCapacity;
		this.modelName = modelName;
	}
	
	// abstract methods
	public abstract void takePicture();
	public abstract void talkOnPhone(int talkedMinutes);
	
	// normal methods
	public void charge() {
		String message = "";
		message = "The phone battery is at " + currentBattery + "\n" + "Recharging";
		System.out.println(message);
		currentBattery = batteryCapacity;
		writeToLogFile("charging");
	}
}
