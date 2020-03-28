import java.util.Date;
import java.util.Scanner;
public class Order {
	static int orderId=1000;
	Date orderDate=new Date();	
	Order()
	{
		orderId++;
	}
	
	void setItems(int noOfItems)
	{
		Scanner sc = new Scanner(System.in);
		int itemNo;
		Item orderCart[]=new Item[noOfItems];
		for (int i = 0; i < noOfItems; i++) 
		 {int k=i+1;
		    System.out.println("\t\t enter itemid FOR "+ k +"th item");
		    itemNo=sc.nextInt();
		    for (int j = 0; j < Menu.itemMenu.length; j++) {
                   
		    	if(Menu.itemMenu[j].itemId==itemNo)
                   {
                	   orderCart[i]=Menu.itemMenu[j];
                	   
                   }
			}
		 }
		
	}
}
