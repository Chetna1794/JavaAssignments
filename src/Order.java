
import java.util.Date;

public class Order {
	private int orderId;
	private Date orderDate = new Date();
	private Item[] orderCart = new Item[] {};
	Order(int id, Date dateTime, Item[] item) {
		this.orderId = id;
		this.orderDate = dateTime;
		this.orderCart = item;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Item[] getOrderCart() {
		return orderCart;
	}
	public void setOrderCart(Item[] orderCart) {
		this.orderCart = orderCart;
	}
	
	// use this for getting date - LocalDateTime.now()
}
