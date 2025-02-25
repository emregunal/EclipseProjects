package SpeedControl;

public class mainClass {

	public static void main(String[] args) {
		
		
		Car car = new Car();
		car.displaySpeed();
		car.increaseSpeed(100);
		car.decreaseSpeed(120);
		car.displaySpeed();

	}

}

/*
Scenario: Car Speed Control System 🚗💨
Create a Car class that allows controlling the speed of a vehicle. The user should be able to 
increase, decrease, and view the current speed.

Requirements:

displaySpeed() → Prints the current speed.
increaseSpeed(int amount) → Increases speed by a given amount (maximum speed: 200 km/h).
decreaseSpeed(int amount) → Decreases speed by a given amount (minimum speed: 0 km/h).
*/
 