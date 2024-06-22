
public class Item {
	private String itemID;
	private String name;
	private String description;
	private double price;
	
	public Item(String itemID, String name, String Description, double price) {
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.price = price;
		
	}
	
	public String getItemID() {
		return itemID;
	
	}
	
	public String getName() {
		return name;
		
	}
	
	public String getDescription() {
		return description;
		
	}
	
	public double getPrice() {
		return price;
		
	}
	
	public String toString() {
		return "Item{" + 
				"itemID='" + itemID + '\'' +
				",name='" + '\'' +
				", description='" + description + '\'' +
				", price=" + price +
				'{';
		
	}
}
