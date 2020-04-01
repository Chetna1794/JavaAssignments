
public class Employee {
	// class variables
	private int idNum;
	private int hourlyWage;

	// Getter Setters
	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	Employee() {
		System.out.println("Default constructor");
	}
	
	// parameterized constructor
	Employee(int idNum, int hourlyWage) throws EmployeeException {
		if(hourlyWage < 6 || hourlyWage > 50 ) {
			throw new EmployeeException("Object cannot be created as hourly rate is not within the expected hour rate");
		}
		this.setIdNum(idNum);
		this.setHourlyWage(hourlyWage);
		System.out.println("Object creaed successfully with id: " +idNum+ "hourly wage: " +hourlyWage);
	}

	@Override
	public String toString() {
		return "Employee [idNum=" + idNum + ", hourlyWage=" + hourlyWage + "]";
	}
}
