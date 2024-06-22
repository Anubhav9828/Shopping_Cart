/*This class manages the shopping cart operations such as adding items, 
*updating quantities, deleting items, and calculating the total value.
*/

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<CartItem> cartItems;
	
	//Construct an empty ShoppingCart.
	
	public ShoppingCart() {
		cartItems = new ArrayList<>();
	}
	
	/*Add an item to the shopping cart with the specified quantity.
	*If the item already exists in the cart, its quantity is updated.
	*/
	
	public void addItem(Item item, int quantity) {
		for(CartItem cartItem : cartItems) {
			if(cartItem.getItem().getItemID().equals(item.getItemID())) {
				cartItem.setQuantity(cartItem.getQuantity() + quantity);
				return;
			}
		}
		cartItems.add(new CartItem(item,quantity));
	}
	
	// updates the quantity of an existing item in the shopping cart.
	
	public void updateItemQuantity(String itemID, int quantity) {
		for(CartItem cartItem : cartItems) {
			if(cartItem.getItem().getItemID().equals(itemID)) {
				cartItem.setQuantity(quantity);
				return;
			}
		}
	}
	
	// Removes an item from the shopping cart based on its unique identifier.
	
	public void removeItem(String itemID) {
		cartItems.removeIf(cartItem -> cartItem.getItem().getItemID().equals(itemID));
	}
	
	/*Displays all items in the shopping cart along with their quantities and total 
	 * prices.
	 */ 
	
	public void showCart() {
		for (CartItem cartItem : cartItems) {
			System.out.println(cartItem);
		}
	}
	
	// Calculate the total value of the items in the shopping cart.
	
	public double getTotalValue() {
		double total = 0;
		for(CartItem cartItem : cartItems) {
			total += cartItem.getTotalPrice();
		}
		return total;
		
	}
	
	// Main method for testing the ShoppingCart functionality.
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1", "Laptop", "A high-performance laptop", 50000);
		Item item2 = new Item("2", "Smartphone", "A latest model smartphone", 25000);
		
		cart.addItem(item1, 1);
		cart.addItem(item2, 2);
		
		System.out.println("Cart after adding items:");
		cart.showCart();
		System.out.println("Total value: " + cart.getTotalValue());
		
		cart.updateItemQuantity("2", 3);
		System.out.println("\nCart after updating item quantity:");
		cart.showCart();
		System.out.println("Total value: " + cart.getTotalValue());
		
		cart.removeItem("1");
		System.out.println("\nCart after removing an item:");
		cart.showCart();
		System.out.println("Total value: " + cart.getTotalValue());
		
		
	}
	

}
