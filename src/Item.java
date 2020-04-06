
public class Item {
	// class variables
	private int itemId;
	private String itemName;
	private double itemPrepTime;
	
	// Getter-Setter
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrepTime() {
		return itemPrepTime;
	}
	public void setItemPrepTime(double itemPrepTime) {
		this.itemPrepTime = itemPrepTime;
	}
	
	// default constructor
	Item(int id, String name, double time) {
		this.itemId = id;
		this.itemName = name;
		this.itemPrepTime = time;		
	}
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrepTime=" + itemPrepTime + "]";
	}
	
}
