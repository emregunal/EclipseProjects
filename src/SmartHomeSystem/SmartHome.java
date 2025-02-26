package SmartHomeSystem;

import java.util.HashMap;

public class SmartHome {
	private HashMap<String, Boolean> rooms;

	public SmartHome(String[] roomNames) {
		rooms = new HashMap<>();
		for (String oda : roomNames) {
			rooms.put(oda, false); // Begin (false)
		}
	}

	public void displayStatus() {
		for (String room : rooms.keySet()) {
			String status = rooms.get(room) ? "Open" : "Close";
			System.out.println(room + ": " + status);
		}
	}

	public void turnOnLight(String roomName) {
		if (rooms.containsKey(roomName)) {
			rooms.put(roomName, true);
			System.out.println(roomName + " turn on light!");
		} else {
			System.out.println("Error: " + roomName + " could not be found!");
		}
	}

	public void turnOffLight(String roomName) {

		if (rooms.containsKey(roomName)) {
			rooms.put(roomName, false);
			System.out.println(roomName + " turn off light!");

		} else {
			System.out.println("Error: " + roomName + " could not be found!");

		}
	}

}
