package Interface;

public class CreditCard implements PaymentMethod {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of $" + amount);
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("Refunding $" + amount + " to credit card.");
	}

}
