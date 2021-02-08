/*1) Create a class which should hold products using a Map using id as key. Write a method which takes Product object as input and stores in the products collection.
	Product[ id, name, price]

2) Write a method to print the products.

3) Write a method which returns the list of ids that map contains.
*/
package Ass4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ass3 {
	String name;
	int id;
	double price;
	static int id1;
	static int c=0;
static	HashMap<Integer,Ass3> h=new HashMap<Integer,Ass3>();
	Ass3(String name,int id,double price)
	{
		this.name=name;
		this.id=id;
		this.price=price;
	}
	public String getname()
	{
		return name;
	}
	public String toString()
	{
		return name+"\t"+id+"\t"+price;
		
	}
	public static void store(int id1,Ass3 a)
	{
	 	//HashMap<Integer,Ass3> h=new HashMap<Integer,Ass3>();
		h.put(id1,a);
		
		    
	}
	
	public static void display()
	{
		for (Map.Entry<Integer, Ass3> me : h.entrySet()) { 
             
            System.out.println(me.getValue()); }
		//System.out.println(a);
	}
	public static void id()
	{
		System.out.println("ids that map contains");
		Set keys=h.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void main(String[] args)
	{
		//HashMap<Integer,Ass3> h=new HashMap<>();
		Ass3 a= new Ass3("p1",1,12);
		Ass3 a1= new Ass3("p2",2,13);
		Ass3 a2= new Ass3("p3",3,56);
		Ass3 a3= new Ass3("p4",4,5);
		Ass3 a4= new Ass3("p5",5,11);
		Ass3 a5= new Ass3("p6",6,14);
		Ass3 a6= new Ass3("p7",9,15);
		Ass3 m[]= {a,a1,a2,a3,a4,a5,a6};
		int id1[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<m.length;i++)
		{
			Ass3.store(id1[i],m[i]);
		}
	
		Ass3.display();
		Ass3.id();

}
}