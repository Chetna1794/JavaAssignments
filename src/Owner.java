import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Owner {
	
	public void modifyMenu() throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter fileWriterObj = new FileWriter("./src/main/resources/Items.txt",true);
			BufferedWriter bufferedWriterObj = new BufferedWriter(fileWriterObj);
			String addItems = "No", itemName, item;
			int itemId;
			Double itemRate;		
			do {
				System.out.println("Do you want to add items in the menu?");
				addItems = sc.next();
				if(addItems.equals("Yes")) {
					System.out.println("Enter item id");
					itemId = sc.nextInt();
					System.out.println("Enter item name");
					itemName = sc.next();
					System.out.println("Enter item rate");
					itemRate = sc.nextDouble();
					item = itemId + "," + itemName + "," + itemRate;
					bufferedWriterObj.append(item);
					bufferedWriterObj.newLine();
				}
			} while (addItems.equals("Yes"));
			bufferedWriterObj.flush();
			fileWriterObj.flush();
			bufferedWriterObj.close();
			fileWriterObj.close();
		} catch (FileNotFoundException fe) {
			System.err.println(fe);
		}
	}
}
