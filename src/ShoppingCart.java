import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<CartItem> cartItems;
	public ShoppingCart() {
		cartItems = new ArrayList<>();
	}
	
	public void addItem(Item item, int quantity) {
		for(CartItem cartItem : cartItems) {
			if(cartItem.getItem().getItemID().equals(item.getItemID())) {
				cartItem.setQuantity(cartItem.getQuantity() + quantity);
				return;
			}
		}
		cartItems.add(new CartItem(item,quantity));
	}
	
	public void updateItemQuantity(String itemID, int quantity) {
		for(CartItem cartItem : cartItems) {
			if(cartItem.getItem().getItemID().equals(itemID)) {
				cartItem.setQuantity(quantity);
				return;
			}
		}
	}
	
	public void removeItem(String itemID) {
		cartItems.removeIf(cartItem -> cartItem.getItem().getItemID().equals(itemID));
	}
	
	public void showCart() {
		for (CartItem cartItem : cartItems) {
			System.out.println(cartItem);
		}
	}
	
	public double getTotalValue() {
		double total = 0;
		for(CartItem cartItem : cartItems) {
			total += cartItem.getTotalPrice();
		}
		return total;
		
	}
	
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
