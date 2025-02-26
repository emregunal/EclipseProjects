package OnlineShoppingCart;

import java.util.HashMap;

public class ShoppingCart {

	private HashMap<String, Double> shopCart;

	public ShoppingCart() {
		this.shopCart = new HashMap<>();
	}

	public void viewCart() {
		System.out.println(shopCart);
	}

	public void addProduct(String productName, Double price) {

		shopCart.put(productName, price);

	}

	public void removeProduct(String productName) {
		shopCart.remove(productName);
	}

}

/*
Scenario: Online Shopping Cart 🛒
Develop a shopping cart system where a user can add products,
remove products, and view the total price.

Requirements:

viewCart() → Displays the products in the cart and the total price.
addProduct(String productName, double price) → Adds a new product to the cart.
removeProduct(String productName) → Removes a specific product from the cart.
*/
