package com.nisum;

import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
int n=sc.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	}

}
