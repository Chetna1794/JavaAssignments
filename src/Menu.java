import java.io.*;

public class Menu {
	public static Item[] itemMenu = new Item[15];
	
	static {
		try {
			FileReader fileReaderObj = new FileReader("./src/main/resources/Items.txt");
			BufferedReader bufferedReaderObj = new BufferedReader(fileReaderObj);
			int itemIndex=0;  
			String str;
	        while((str = bufferedReaderObj.readLine())!=null ){
	          String arr[] =  str.split(",");
	          int itemId = Integer.parseInt(arr[0]);
	          String itemName = arr[1];
	          Double itemRate = Double.parseDouble(arr[2]);
	          itemMenu[itemIndex] = new Item(itemId, itemName, itemRate); 
	          itemIndex++;	          
	        }  
            bufferedReaderObj.close();
            fileReaderObj.close();
		} catch (FileNotFoundException fe) {
			System.err.println(fe);
		} catch (IOException ie) {
			System.err.println(ie);
		}
	}
}
