// This class represents an item with properties like 'itemID','name, 'description' and 'price'.

public class Item {
	private String itemID;
	private String name;
	private String description;
	private double price;
	
//construct an item with specified details.	
	public Item(String itemID, String name, String Description, double price) {
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.price = price;
		
	}

//getters for item properties
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
