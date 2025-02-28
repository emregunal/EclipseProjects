package Interface;

public class PayPal implements PaymentMethod{
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("Refunding $" + amount + " to PayPal.");
	}

}
