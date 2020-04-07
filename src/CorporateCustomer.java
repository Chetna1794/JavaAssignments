
public class CorporateCustomer extends Customer {
	// class variables
	private int registrationNumber;
	private float discountPercent; 

	// Getter-Setters
	public int registrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	// Parameterized constructor
	CorporateCustomer(int customerID, String customerName, String customerDob, String customerMobile,
			String customerType, String customerAddress) {
		super(customerID, customerName, customerDob, customerMobile, customerType, customerAddress);
		RegularAndCorporate.updateCorporateCustomer(customerID, customerName);
	}

	
}
