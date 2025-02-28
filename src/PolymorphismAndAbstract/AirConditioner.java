package PolymorphismAndAbstract;

public class AirConditioner extends SmartAppliance {

	public AirConditioner() {

	}

	public void setTemperature(int temp) {
		System.out.println("Temperature set to " + temp + "°C");
	}

	@Override
	public void turnOn() {
		System.out.println("Air Conditioner is now ON.");
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println("Air Conditioner is now OFF.");
		isOn = false;
	}

}
