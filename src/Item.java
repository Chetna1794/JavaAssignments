
public class Item {
	// class variables
	private int itemId;
	private String itemName;
	private double itemRate;
	
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
	
	public double getItemRate() {
		return itemRate;
	}
	public void setItemRate(double itemRate) {
		this.itemRate = itemRate;
	}
	// default constructor
	Item(int id, String name, double rate) {
		this.itemId = id;
		this.itemName = name;
		this.itemRate = rate;		
	}
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemRate=" + itemRate + "]";
	}
	
}
