// 3) Write a method to check if given product exists in the above list. return true or false based on product id.
package Ass4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1_3  {
String name;
int id;
double price;
static int id1;
static int c=0;
A1_3(String name,int id,double price)
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
public void checkinfo()
{
	
}
public void check(A1_3 a1)
{
	
		if(a1.id==id1)
		{
			c=0;
			System.out.println(true);
			System.exit(1);
		}
		else
		{
			c=1;
			
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search");
		 id1=sc.nextInt();
		 A1_3 a1=new A1_3("Ranjani",1,12);
	      A1_3 a2=new A1_3("ramya",2,34.66);
	      A1_3 a3=new A1_3("sushma",3,9);
	      A1_3 a4=new A1_3("akhila",4,7);
	      A1_3 a5=new A1_3("komala",5,11);
	      A1_3 a6=new A1_3("bala",6,9);
	      A1_3 a7=new A1_3("sruthi",7,1);
	      A1_3 a8=new A1_3("manasa",8,5);
	      A1_3 a[]= {a1,a2,a3,a4,a5,a6,a7,a8};
	      
 for(int i=0;i<a.length;i++)
  {
	  a[i].check(a[i]);
  }
  if(c==1)
  {
	  System.out.println(false);
	  
  }
	}
	
}
