package com.nisum;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size opf the array");
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  System.out.println("Enter the array elements");
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.println("Enter the size opf the array");
		  int k=sc.nextInt();
		  int b[]=new int[k];
		  System.out.println("Enter the array elements");
		  for(int i=0;i<k;i++)
		  {
			  b[i]=sc.nextInt();
		  }
// int a1[]= {1,2,3};
// int a2[]= {3,4,5};
 int l1=a.length;
 int l2=b.length;
 int m=0;
 int res[]=new int[l1+l2];
 
 for(int i=0;i<l1;i++)
 {
	 res[i]=a[i];
 }
 for(int j=l1;j<l2+l1;j++)
 { 
	 
	 res[j]=b[m];
	 m++;
	// System.out.print(res[j]+" "+1);
 }
 for(int p=0;p<l1+l2;p++)
 {
	 System.out.print(res[p]+" ");
 }
	}

}
