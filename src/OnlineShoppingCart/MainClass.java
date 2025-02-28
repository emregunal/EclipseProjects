package OnlineShoppingCart;

public class MainClass {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct("Laptop", 15000.0);
		cart.addProduct("Mouse", 500.0);
		cart.viewCart();
		cart.addProduct("Key", 5000.0);
		cart.removeProduct("Mouse");
		cart.viewCart();
		
	}

}
