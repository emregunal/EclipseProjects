package SpeedControl;

public class Car {
	
	private int currentSpeed;
	
	public Car() {
		
	}
	
	public void displaySpeed() {
		
		
		System.out.println("Current Speed: "+currentSpeed+" km/h");
		
	}
	public void increaseSpeed(int amount) {
		if((currentSpeed+amount)<201) {			
			currentSpeed+=amount;
			System.out.println("Speed increased to "+(amount) + "km/h");
		}
		else
		{
			System.out.println("Speed limit, sorry please try again!");
			return;
		}
		
	}
	public void decreaseSpeed(int amount) {
		if((amount-currentSpeed)<-1 && amount >= 0 || (amount-currentSpeed)>currentSpeed) {
			currentSpeed-=amount;
			System.out.println("Speed decreased to "+(amount) + "km/h");			
		}
		else
		{
			System.out.println("Speed minimum limit, sorry please try again!");
			return;
		}
	}

}
