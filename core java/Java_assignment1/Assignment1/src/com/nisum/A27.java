package com.nisum;

import java.util.Scanner;

public class A27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size opf the array");
		  int n=sc.nextInt();
		  System.out.println("Enter the specific element to remove");
		  int c=sc.nextInt();
		  System.out.println("Enter the array elements");
		  int a[]=new int[n];
		  int res[]=new int[n];
		  int k=0;
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  for(int j=0;j<n;j++)
		  {
			  if(c==a[j])
			  {
				 /// System.out.println(c);
				  continue;
				  
			  }
			  else
			  {
				  res[k]=a[j];
				  k++;
			  }
		  }
		  for(int m=0;m<k;m++)
		  {
			  System.out.println(res[m]);
		  }
	}

}
