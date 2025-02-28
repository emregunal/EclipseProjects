package PolymorphismAndAbstract;

abstract public class SmartAppliance {

	protected boolean isOn = false;

	public SmartAppliance() {

	}

	public void status() {
		System.out.println(getClass().getSimpleName() + " is " + (isOn ? "ON" : "OFF"));

	}

	abstract void turnOn();

	abstract void turnOff();

}
