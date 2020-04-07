
public class RegularCustomer extends Customer {
	// class variables
	private int customerPoints;
	
	// Getters-Setters
	public int getCustomerPoints() {
		return customerPoints;
	}

	public void setCustomerPoints(int customerPoints) {
		this.customerPoints = customerPoints;
	}

	// Parameterized Constructor
	RegularCustomer(int customerID, String customerName, String customerDob, String customerMobile, String customerType,
			String customerAddress) {
		super(customerID, customerName, customerDob, customerMobile, customerType, customerAddress);
		RegularAndCorporate.updateRegularCustomer(customerID, customerName);
	}
}
