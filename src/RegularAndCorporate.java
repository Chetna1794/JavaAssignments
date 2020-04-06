import java.io.*;

public class RegularAndCorporate {
	
	public static void updateRegularCustomer(int customerID, String customerName) {
		try {
			FileWriter regCustFileWriter = new FileWriter("./src/main/resources/RegularCustomer.txt",true);
			BufferedWriter regCustBufferWriter = new BufferedWriter(regCustFileWriter);
			String regCustomerDetails = customerID + "," + customerName;
			regCustBufferWriter.append(regCustomerDetails);
			regCustBufferWriter.flush();
			regCustFileWriter.flush();
			regCustBufferWriter.close();
			regCustFileWriter.close();
		} catch(IOException ie) {
			System.err.println(ie);
		}
	}
	
	public void displayRegularCustomerData() {
		try {
			FileReader regCustFileReader = new FileReader("./src/main/resources/RegularCustomer.txt");
			BufferedReader regCustBufferReader = new BufferedReader(regCustFileReader);
			System.out.println("Regular Customer Details");
			String str;
	        while((str = regCustBufferReader.readLine())!=null ){
	          String arr[] =  str.split(",");
	          int customerID = Integer.parseInt(arr[0]);
	          String customerName = arr[1];
	          System.out.println("Customer ID: "+customerID+ ", Customer Name: "+customerName);        
	        }  
			regCustBufferReader.close();
			regCustFileReader.close();
		} catch(IOException ie) {
			System.err.println(ie);
		}
	}
	
	public static void updateCorporateCustomer(int customerID, String customerName) {
		try {
			FileWriter corpCustFileWriter = new FileWriter("./src/main/resources/CorporateCustomer.txt",true);
			BufferedWriter corpCustBufferWriter = new BufferedWriter(corpCustFileWriter);
			String corpCustomerDetails = customerID + "," + customerName;
			corpCustBufferWriter.append(corpCustomerDetails);
			corpCustBufferWriter.newLine();
			corpCustBufferWriter.flush();
			corpCustFileWriter.flush();
			corpCustBufferWriter.close();
			corpCustFileWriter.close();
		} catch (IOException ie) {
			System.err.println(ie);
		}
	}
	
	public void displayCorporateCustomerData() {
		try {
			FileReader corpCustFileReader = new FileReader("./src/main/resources/CorporateCustomer.txt");
			BufferedReader corpCustBufferReader = new BufferedReader(corpCustFileReader);
			System.out.println("Corporate Customer Details");
			String corporteCustomerDetails;
	        while((corporteCustomerDetails = corpCustBufferReader.readLine())!=null ){
	          String arr[] =  corporteCustomerDetails.split(",");
	          int customerID = Integer.parseInt(arr[0]);
	          String customerName = arr[1];
//	          int registratonId = Integer.parseInt(arr[2]);
//	          float discountPercent = Float.parseFloat(arr[3]);
	          System.out.println("Customer ID: "+customerID+ ", Customer Name: "+customerName);        
	        } 
			corpCustBufferReader.close();
			corpCustFileReader.close();
		} catch (IOException ie) {
			System.err.println(ie);
		}
	}
}
