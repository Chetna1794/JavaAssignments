import java.io.IOException;
import java.util.Date;

public class Restaurant {
	private static Order[] orderList = new Order[]{};
	private int counter;
	public char ans = 'y';
	public static int i;
	
	public static Order[] getOrderList() {
		return orderList;
	}

	public static void setOrderList(Order[] orderList) {
		Restaurant.orderList = orderList;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	/**
	 * this function will show menu to the customer
	 * @throws IOException 
	 */
	public void showMenu() throws IOException {
		System.out.println("Please select from follwing items by entering their Id");
		for(int i=0; i < Menu.itemMenu.length; i++) {
			System.out.println(Menu.itemMenu[i].getItemId() + " - " + Menu.itemMenu[i].getItemName() + " - " + Menu.itemMenu[i].getItemPrepTime());;
		}
		System.out.println("Would you like to return to main menu? (y/n)");
//		int returnToMainMenu = System.in.read();
//		ans = (char)returnToMainMenu;
//		if(ans == 'y') {
//			showMainMenu();
//		}
	}
	
	/**
	 * this function will take order from the customer
	 * @throws IOException 
	 */
	public void takeOrder() throws IOException {
		int orderID = this.counter++;
		Date currentDateTime = new Date();
		int selectedChoice= System.in.read(); 
		System.out.println("You have selected: " + (char)selectedChoice);
		Item[] selectedItem = new Item[] {};
		selectedItem[0] = Menu.itemMenu[selectedChoice];
		Order myOrder = new Order(orderID, currentDateTime, selectedItem);	
		System.out.println("Your order details are: ");
		System.out.println(myOrder);
	}
	
	/**
	 * this function will provide order status
	 * @param orderId -  Id of the order
	 */
	public boolean checkStatus(int orderId) {
		boolean isOrderPresent = false;
		for(int j=0; j < orderList.length; j++) {
			if(orderId == orderList[j].getOrderId()) {
				isOrderPresent = true;
			}
		}
		return isOrderPresent;
	}
	
	/**
	 * this function will show regular customer offers
	 * @param custId - Regular Id of the customer
	 */
	public void showRegularCustomerOffers(int custId) {
		
	}
	
	/**
	 * this function will provide corporate customer offers
	 * @param corpId - Corporate Id of the customer
	 */
	public void showCorpCustomerOffers(int corpId) {
		
	}
	
	public void showMainMenu() throws IOException {
		while(ans == 'y') {
			switch(i) {
			case 1: {
				showMenu();
				ans = 'n';
				break;
			}
			case 2: {
				takeOrder();
				ans = 'n';
				break;
			}
			case 3: {
				System.out.println("Please enter your order Id");
				int orderId= System.in.read();
				checkStatus(orderId);
				ans = 'n';
				break;
			}
			case 4: {
				System.out.println("Please enter your regular customer Id");
				int regCustomerId= System.in.read();
				checkStatus(regCustomerId);
				ans = 'n';
				break;
			}
			case 5: {
				System.out.println("Please enter your corporate customer Id");
				int corpCustomerId= System.in.read();
				checkStatus(corpCustomerId);
				ans = 'n';
				break;
			}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Debonair Restaurant.");
		System.out.println("Please select your choice from given menu");
		System.out.println("1. Show Menu");
		System.out.println("2. Take Order");
		System.out.println("3. Check Order status");
		System.out.println("4. Show Regular customer Offers");
		System.out.println("5. Show Corporate Customer Offers");
		i= System.in.read(); 
		i=Character.getNumericValue(i);
		System.out.println("You have selected: " + (char)i);
		Restaurant res = new Restaurant();
		res.showMainMenu();
	}
}
