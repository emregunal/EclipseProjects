package PolymorphismAndAbstract;

public class SmartTV extends SmartAppliance {

	private int channel = 1;

	public SmartTV() {

	}

	@Override
	public void turnOn() {
		System.out.println("Smart TV is now ON. Default Channel: "+channel);
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV is now OFF.");
		isOn = false;
	}

	public void changeChannel(int channel) {
		this.channel = channel;
	}

}
