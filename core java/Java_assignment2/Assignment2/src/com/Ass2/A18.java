//18) Write a Java Program to reverse a given string
package com.Ass2;

import java.util.Scanner;

public class A18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String name=sc.next();
String res="";
for(int i=name.length()-1;i>=0;i--)
{
	res=res+name.charAt(i);
}
System.out.println(res);

	}

}
