
public class CartItem {
	private Item item;
	private int quantity;
	
	public CartItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public Item getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
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
