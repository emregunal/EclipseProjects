package PolymorphismAndAbstract;

public class Light extends SmartAppliance{
	
	public Light() {
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("Light is now ON.");
		isOn=true;
	}
	@Override
	public void turnOff() {
		System.out.println("Light is now OFF.");
		isOn=false;
	}
	

}
