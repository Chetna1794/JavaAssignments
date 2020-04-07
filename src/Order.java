
import java.awt.Choice;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Order {
	// class level variables
	private int orderId;
	private int customerId;
	private LocalDateTime orderDate = LocalDateTime.now();
	private TreeSet<Item> orderCart;
	private static int counter;
	private static HashMap<Integer, Bill> currentSale = new HashMap(); 
	
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
	public TreeSet<Item> getOrderCart() {
		return orderCart;
	}
	public void setOrderCart(TreeSet<Item> orderCart) {
		this.orderCart = orderCart;
	}
	
	// Parameterized Constructor
	Order(int id, LocalDateTime dateTime, TreeSet<Item> ss) {
		this.orderId = id;
		this.orderDate = dateTime;
		this.orderCart = ss;
	}
	
	@Override
	public String toString() {
		Iterator<Item> i = orderCart.iterator();
		String displayableOrderCart = null;
		Double totalCartPrice = 0.00;
		while (i.hasNext()) {
			Item item = (Item) i.next();
			if(displayableOrderCart == null) {
				displayableOrderCart = item.getItemName();
			} else {
				displayableOrderCart = displayableOrderCart.concat(item.getItemName());
			}
			totalCartPrice += item.getItemRate();
			if(i.hasNext()) {
				displayableOrderCart = displayableOrderCart.concat(", ");
			}
		}
		String formattedOrderDate = ""+orderDate.getDayOfMonth()+"-"+orderDate.getMonth()+"-"+orderDate.getYear();
		Bill billObj = new Bill(this.orderId, 456, totalCartPrice, orderDate);
		currentSale.put(this.orderId, billObj);
		return "Order Date: " + formattedOrderDate + ", Order Cart: " + displayableOrderCart + ", Total Price: "+ totalCartPrice;
	}
	public static void createOrder() {
		int orderID = (int) Math.random();
		LocalDateTime currentDateTime = LocalDateTime.now();
		Scanner sc= new Scanner(System.in);
		String choice = "n";
		TreeSet<Item> ss = new TreeSet<Item>(new ItemListComparator());
		do {
			System.out.println("Select item Id you want to add to the cart");
			int itemNumber= sc.nextInt();
			ss.add(Menu.itemMenu.get(itemNumber));
			System.out.println("Would you like to order more items");
			choice = sc.next();
		} while (choice.equals("y"));
		Order myOrder = new Order(orderID, currentDateTime, ss);
		System.out.println("Your bill details are:- ");
		System.out.println(myOrder);
		System.out.println("Current Sale" );
		System.out.println(getCurrentSale());
	}
	public static HashMap<Integer, Bill> getCurrentSale() {
		return currentSale;
	}
	public static void setCurrentSale(HashMap<Integer, Bill> currentSale) {
		Order.currentSale = currentSale;
	}
}
