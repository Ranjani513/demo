/*1) Write a Java program for student class with basic student
 *  Information(name,address,section, college,class,roll no) and display all students details.
 */


package com.Ass2;

import java.util.Scanner;

public class Student {
	String name;
	String Address;
	String Section;
	int roll_no;
	 String college;

	public void getdetails(String name,String Address,String Section,int roll_no,String college)
	{
		this.name=name;
		this.Address=Address;
		this.Section=Section;
		this.roll_no=roll_no;
		this.college=college;
		System.out.println("Name:"+name+" "+"Address:"+Address+" "+"Section:"+Section+" "+"rollno:"+roll_no+" "+"College:"+college);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the Address:");
        String Address=sc.nextLine();
        System.out.println("Enter the Section:");
        String Section=sc.nextLine();
        System.out.println("Enter the Roll_no:");
 int roll_no=sc.nextInt();
 System.out.println("Enter the college:");
 String college=sc.nextLine();
Student st=new Student();
st.getdetails(name, Address, Section, roll_no,college);
}
}