//20) Write a java program to find factorial of  a number
package com.Ass2;

import java.util.Scanner;

public class A20 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int fact=1;
	while(n!=0)
	{
		fact=fact*n;
		n--;
	}
	System.out.println("Factorial of agiven number is:"+fact);
	
}
}