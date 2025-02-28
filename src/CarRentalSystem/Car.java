package CarRentalSystem;

public class Car {

	private String make, model;
	private int year=2024, dailyPrice=500;

	public Car(String make, String model, int year, int dailyPrice) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.dailyPrice = dailyPrice;
	}

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public void showInfo() {
		System.out.println("Brand: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Daily Price: "+dailyPrice);
	}

}
