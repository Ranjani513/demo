/*1. Iterate list of order objects using Iterator and remove the orders of status "PENDING".

	order [ "O345" , "COMPLETED" ]
	order [ "O456" , "COMPLETED" ]
	order [ "O789" , "IN-TRNASIT" ]
	order [ "O346" , "PENDING" ]
	order [ "O347" , "PENDING" ]
	order [ "O348" , "CANCELLED" ]
	order [ "O678" , "PENDING" ]

2. Iterate above list of order objects using foreach find out if this list has any "PENDING" order and if it finds then make sure the next orders are not verified.
*/
package Ass4;

import java.util.ArrayList;
import java.util.Iterator;

public class Order1 {
	String id;
	String status;
	static ArrayList<Order1> a=new ArrayList<>();
	Order1(String id,String status)
	{
		this.id=id;
		this.status=status;
	}
	
	public Order1(Order1 u) {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "["+id+","+status+"]";
	}
	public static void verify(ArrayList<Order1> a)
	{
		Iterator<Order1> it=a.iterator();
		while(it.hasNext())
		{
			Order1 u=it.next();
			if(((u.status).equals("PENDING")))
			{
			    break;
				
			}
			System.out.println(u);
			
		}
	}
	public static  void delete(ArrayList<Order1> a)
	{
		Iterator<Order1> it=a.iterator();
		while(it.hasNext())
		{
			Order1 u=it.next();
			if(((u.status).equals("PENDING")))
			{
				it.remove();
				
			}
			
			
		}
		
	}

	public static void main(String[] args)
	{
		ArrayList<Order1> a=new ArrayList<>();

	a.add(new	Order1 ( "O345" , "COMPLETED" ));
	a.add(new Order1( "O456" , "COMPLETED" ));
	a.add(new Order1("O789" , "IN-TRNASIT" ));
	a.add(new Order1( "O346" , "PENDING" ));
	a.add(new Order1("O347" , "PENDING" ));
	a.add(new Order1( "O348" , "CANCELLED" ));
	a.add(new Order1( "O678" , "PENDING" ));
	Order1.verify(a);
	System.out.println("list of orders after removing pending items");
	Order1.delete(a);
	
	for(Order1 f:a)
	{
		System.out.println(f);
	}
	}

}