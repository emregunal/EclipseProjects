package Interface;

public class MainClass {

	public static void main(String[] args) {

		PaymentMethod[] payments = { new CreditCard(), new PayPal(), new Crypto() };

		for (PaymentMethod payment : payments) {
			payment.processPayment(100);
			payment.refundPayment(50);
			System.out.println("------------------");

		}

	}

}
