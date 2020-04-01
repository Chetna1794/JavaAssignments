
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Order {
	// class level variables
	private int orderId;
	private int customerId;
	private LocalDateTime orderDate = LocalDateTime.now();
	private Item[] orderCart = new Item[10];
	
	// Getter-Setters
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public Item[] getOrderCart() {
		return orderCart;
	}
	public void setOrderCart(Item[] orderCart) {
		this.orderCart = orderCart;
	}
	
	// Parameterized Constructor
	Order(int id, LocalDateTime dateTime, Item[] item) {
		this.orderId = id;
		this.orderDate = dateTime;
		this.orderCart = item;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate + ", orderCart="
				+ Arrays.toString(orderCart) + "]";
	}
	
}
