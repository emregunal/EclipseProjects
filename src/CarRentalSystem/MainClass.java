package CarRentalSystem;

public class MainClass {

	public static void main(String[] args) {

		Car car1 = new Car("Toyota", "Corolla", 2022, 700);
		Car car2 = new Car("Honda", "Civic"); // Default year and price will be set

		car1.showInfo();
		car2.showInfo();
	}

}
/*
 * Scenario: Car Rental System 🚗🏢 (Advanced Constructor Overloading) Develop a
 * car rental system where users can reserve different types of vehicles. The
 * system should support multiple constructors with different parameters.
 * 
 * Requirements: There will be two different constructors: Full constructor:
 * Allows entering the car brand, model, year, and daily rental price. Shortcut
 * constructor: If only brand and model are provided, the default year should be
 * 2024, and the daily price should be 500 TL. Methods: showInfo() → Displays
 * the car's details.
 */