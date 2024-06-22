// This class represents an item in the shopping  cart along with its quantity.

public class CartItem {
	private Item item;
	private int quantity;

//construct a CartItem with the specified item and quantity.
	
	public CartItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

//Getters and setters for CartItem properties.
	public Item getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
//calculates the total price of the CartItem based on the item price and quantity.
	
	public double getTotalPrice() {
		return item.getPrice()*quantity;
	}
	
	public String toString() {
		return "CartItem{" +
				"items=" + item +
				"quantity=" + quantity +
				"totalPrice=" + getTotalPrice() +
				'}';
	}
}
