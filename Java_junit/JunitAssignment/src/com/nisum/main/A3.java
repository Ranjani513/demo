package com.nisum.main;

import java.util.ArrayList;
import java.util.List;

public class A3 {
 public List<Integer> fib(int i)
 {
	 if(i<0)
	 {
		  throw new UserException("Invalid");
	 }
	 else
	 {
		return fibo(i);
	 }
 }
 public List<Integer> fibo(int i)
 {
	 List<Integer> l=new ArrayList();
	int n1=0;
	int n2=1;
	 if(i==1)
	 {
		 l.add(0);
		 return l;
	 }
	 else if(i==2)
	 {
		 l.add(0);
		 l.add(1);
		 return l;
	 }
	 else
	 {
		 l.add(0);
		 l.add(1);
		 int count=i-2;
		 while(count!=0)
		 {
			 int n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 
			 count--;
			 l.add(n2);
		 }
	 }
	
	return l;
	 
	 
 }
}