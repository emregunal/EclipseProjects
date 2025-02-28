package PolymorphismAndAbstract;

public class MainClass {

	public static void main(String[] args) {
		SmartAppliance[] appliances = { 
				new Light(), 
				new AirConditioner(), 
				new SmartTV()
																							
		};

		for (SmartAppliance appliance : appliances) {
			appliance.turnOn();
			appliance.status();
			appliance.turnOff();
			System.out.println("------------------");
		}

		
		AirConditioner ac = new AirConditioner();
		ac.turnOn();
		ac.setTemperature(22); 
		
		SmartTV smartTv = new SmartTV();
		smartTv.changeChannel(24);
		smartTv.turnOn();
		
		
	}

}
