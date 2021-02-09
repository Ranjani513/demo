/*1) Create a class which should hold distinct products. Write a method which takes 
Product object as input and stores in the 
products collection.
	Product[ id, name, price]

2) Write a method to print the products using Iterator.

3) Write a method which takes Product object as input and replace an existing product from collection by id.
*/
package Ass4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ass2 {
	String name;
	int id;
	double price;
	static int id1;
	static int c=0;
	static int c1=0;
	//static HashSet<Ass2> list=new HashSet<>();
	static ArrayList<Ass2> list=new ArrayList<>();
	static ArrayList<Ass2> newlist=new ArrayList<>();
	Ass2(String name,int id,double price)
	{
		this.name=name;
		this.id=id;
		this.price=price;
	}
	/*public int compareTo(A1_2 a)
	{
		return this.id-a.id;
		
	}*/
	
	public int getid()
	{
		return id;
	}
	public String toString()
	{
		return name+"\t"+id+"\t"+price;
		
	}
	public static void print(ArrayList<Ass2> list)
	{
		Iterator<Ass2> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static  void set(ArrayList<Ass2> list)
	{
		
		String name1;
		int id1;
		double price;
		for(Ass2 s:list) {
			
		   for(Ass2 n:newlist)
		   {
			   if(s.id==n.id && (s.name).equals(n.name) && s.price==n.price)
			   {
				   
				   continue;
				   
			   }
			   else
			   {
				   System.out.println("hi");
				   newlist.add(s);
			   }
			  
		   }
	}
		
	}
	public static void replace1(ArrayList<Ass2> li,int id1)
	
	{
		Iterator<Ass2> it=li.iterator();
		while(it.hasNext()) {
			Ass2 f= (Ass2)it.next();
			c++;
			Ass2 g=new Ass2("hi",23,344);
			if(id1==f.id)
			{
				it.remove();
			//	System.out.println("hi");
				li.set(c, g);
				
			}
			
		
		//System.out.println(list);
	}
	}
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count=0;
			Scanner sc=new Scanner(System.in);
			
		      list.add(new Ass2("Ranjani",9,12));
		     list.add(new Ass2("ramya",2,34.66));
		     list.add(new Ass2("sushma",1,9));
		      list.add(new Ass2("akhila",5,7));
		     list.add(new Ass2("komala",4,11));
		     list.add(new Ass2("Ranjani",9,12));
		     list.add(new Ass2("sruthi",8,1));
		     list.add(new Ass2("manasa",6,5));
		     newlist.add((new Ass2("Ranjani",9,12)));
	   /* for(Ass2 l:list) {
		   Ass2.set(l);
	 
		}*/
	    System.out.println("enter the id to be replaced");
	 int id1=sc.nextInt();
	  System.out.println("it prints the elements with method iterator ");
	    Ass2.print(list);
	  Ass2.replace1(list,id1);
	    for(Ass2 f:list)
	    {
	    	System.out.println(f);
	    }
	  /*  Ass2.set( list);
	    for(Ass2 j:newlist)
	    {
	    	System.out.println(j);
	    }*/
	  
		}
}