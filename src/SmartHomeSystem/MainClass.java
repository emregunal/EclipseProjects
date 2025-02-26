package SmartHomeSystem;

public class MainClass {

	public static void main(String[] args) {

		SmartHome smartHome = new SmartHome(new String[] { "Living Room", "Kitchen", "Bathroom" });
		smartHome.displayStatus();
		smartHome.turnOnLight("Kitchen");
		smartHome.turnOnLight("Living Room");
		smartHome.displayStatus();
		smartHome.turnOffLight("Living Room");
		smartHome.displayStatus();

	}

}

/*
 * SMART HOME SYSTEM A smart home system should manage turning lights on/off for
 * different rooms. The user should be able to turn the light on or off in a
 * specific room.
 * 
 * displayStatus() → Shows whether the lights in all rooms are on or off.
 * turnOnLight(String roomName) → Turns on the light in the specified room.
 * turnOffLight(String roomName) → Turns off the light in the specified room.
 */