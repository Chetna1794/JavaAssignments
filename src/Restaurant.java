import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;

public class Restaurant implements IRestaurant  {
	private static Order[] orderList = new Order[10];
	private Customer CustomerList[] = new Customer[10];
	
	public static Order[] getOrderList() {
		return orderList;
	}

	public static void setOrderList(Order[] orderList) {
		Restaurant.orderList = orderList;
	}
	
	public Customer[] getCustomerList() {
		return CustomerList;
	}

	public void setCustomerList(Customer customerList[]) {
		CustomerList = customerList;
	}
	
	/**
	 * this function will show menu to the customer
	 */
	public void showMenu() {
		try {
			Iterator<Item> i = Menu.itemMenu.iterator();
			while (i.hasNext()) {
				Item item = (Item) i.next();
				System.out.println(item.getItemId() + " - " + item.getItemName() + " - " + item.getItemRate());
			}
			
		} catch(NullPointerException ne) {
			System.err.println(ne);
		}
	}
	
	/**
	 * this function will take order from the customer
	 */
	public void takeOrder() {
		Order.createOrder();
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
		if(custId > 25) {
			System.out.println("This is not a valid Regular Customer Id");
		} else {
			RegularCustomer rc = new RegularCustomer(123, "Chetna", "12-Mar-1994", "987654321", "Regular", "Hell");
			int day = LocalDateTime.now().getDayOfWeek().getValue();
			System.out.println(day);
			if(day == 6 || day == 7) {
				System.out.println("Hurraaayy!! 10% discount will be applicable on the order");
			} else {
				System.out.println("Oops, no offers available for you!");
			}
		}
	}
	
	/**
	 * this function will provide corporate customer offers
	 * @param corpId - Corporate Id of the customer
	 */
	public void showCorpCustomerOffers(int corpId) {
		if(corpId < 24) {
			System.out.println("This is not a valid Corporate Customer Id");
		} else {
			CorporateCustomer cc = new CorporateCustomer(123, "Chetna", "12-Mar-1994", "987654321", "Corporate", "Dusra Hell");
			System.out.println("You will get a meal voucher of 100 Rs.");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
//		Owner ownerObj = new Owner();
//		ownerObj.modifyMenu();
		Restaurant res = new Restaurant();
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		String showMenuChoice = "no";
		do {
			System.out.println("Welcome to Debonair Restaurant.");
			System.out.println("Please select your choice from given menu");
			System.out.println("1. Show Menu");
			System.out.println("2. Take Order");
			System.out.println("3. Check Order status");
			System.out.println("4. Show Regular customer Offers");
			System.out.println("5. Show Corporate Customer Offers");
			System.out.print("Enter your choice :");
			choice=sc.nextInt();
			switch(choice) {
				case 1: {
					res.showMenu();
					break;
				}
				case 2: {
					res.takeOrder();
					break;
				}
				case 3: {
					System.out.println("Please enter your order Id");
					int orderId= sc.nextInt();
					res.checkStatus(orderId);
					break;
				}
				case 4: {
					System.out.println("Please enter your Regular Customer Id");
					int regCustomerId= sc.nextInt();
					res.showRegularCustomerOffers(regCustomerId);
					break;
				}
				case 5: {
					System.out.println("Please enter your Corporate Customer Id");
					int corpCustomerId= sc.nextInt();
					res.showCorpCustomerOffers(corpCustomerId);
					break;
				}
				default: System.out.println("Please enter valid choice");
		        break;	
		}
		System.out.println("Would you like to return to main menu? (yes/no)");
		showMenuChoice=sc.next();
		} 
		while(showMenuChoice.equals("yes"));
		if(showMenuChoice.equals("no"))	{
			System.exit(1);
		}
	}
}
