import java.util.Scanner;


public class restraunt {

	Order OrderList[]=new Order[1];
	void showMenu()
	 {
		Menu.show();
		
	 }
	
	void takeOrder()
	 {
		System.out.println("\t\thow many items do you want to add");
		Scanner sc= new Scanner(System.in);
		int noOfItems=sc.nextInt();
		
		Order obj=new Order();
		obj.setItems(noOfItems);
		OrderList[0]=obj;
		System.out.println("\t\t order placed sucessfully  and your order no is :" + Order.orderId);
	 }
	void orderStatus(int orderId)
	 {
		if(orderId==OrderList[0].orderId)
		{
			
			System.out.println("your order is under process and will be ready soon");
		}
		else
		{
			
			System.out.println("wrong order id");
		}
		
	 }
	void showCorpCustomerOffer(int corpId)
	{
		System.out.println("your offers are blah blah blah!!!");	
	}
	void showRegCustomerOffer(int custId)
	{
		System.out.println("your offers are blah blah blah!!!");
		
	}
	public static void main(String[] args) {
		
		String choice;
		int choice1=0;
		restraunt obj= new restraunt();
		Scanner sc= new Scanner(System.in);
		
		do
		{
			System.out.println("\t\t welcome to The Debonair!!!!!!!");
            System.out.println("\t\t***********menu*****************");
            System.out.println("\t\ttake order");
            System.out.println("\t\torder status");
            System.out.println("\t\tmenu");
            System.out.println("\t\tcorporate offers");
            System.out.println("\t\toffers & gifts for regular customers");
            System.out.println("\t\texit");
			System.out.print("\t\tenter your choice :");
			choice1=sc.nextInt();
			int orderId;
			
			switch(choice1)
			{
			case 1:obj.takeOrder();
			       break;
			case 2:System.out.println("\t\tenter your orderid :");
			       orderId=sc.nextInt();
			       obj.orderStatus(orderId);
			       break;
			case 3:obj.showMenu();
			       break;
			case 4:obj.showCorpCustomerOffer(1);
			       break;
			case 5:obj.showRegCustomerOffer(1);
			       break;
			case 6:System.exit(1);
			       break;
			       
			default:System.out.println("\t\tplease enter valid choice");
			        break;
			
			}
			System.out.println("\t\tdo you want to continue?Type yes else type no ");
			choice=sc.next();
		}
		while(choice.equals("yes"));
		if(choice.equals("no"))
		{
			System.exit(1);
			
		}
	}

}
