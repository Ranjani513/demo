//12)Static block and static method : write program to illustrate which one executes first?
package com.Ass2;

import java.util.Scanner;

public class A12 {
	static String name;
	static int age;
	A12(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public static void getdetails()
	{
		System.out.println("Name:"+name+"\t"+"Age"+age);
		System.out.println("I am in static method");
	}
	static
	{
		System.out.println("I am in static  block");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		A12 a=new A12(name,age);
		a.getdetails();
	}
}


