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
