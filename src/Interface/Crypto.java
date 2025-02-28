package Interface;

public class Crypto implements PaymentMethod{
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing cryptocurrency payment of $" + amount);
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("Refunding $" + amount + " to cryptocurrency.");
	}

}
