
public class Menu {
	static Item itemMenu[]=new Item[5];
	
	static
	{
		itemMenu[0]=new Item(1,"soup",1);
		itemMenu[1]=new Item(2,"biryani",1);
		itemMenu[2]=new Item(3,"roll",1);
		itemMenu[3]=new Item(4,"aloo",1);
		itemMenu[4]=new Item(5,"paneer",1);
	}
	static void show()
	 {
		for (int i = 0; i < itemMenu.length; i++) {
			System.out.print(itemMenu[i].itemId+"\t");
			System.out.print(itemMenu[i].itemName+"\t");
			System.out.print(itemMenu[i].itemPrepTime +" minutes");
			System.out.println();
		}
		
	 }

}
