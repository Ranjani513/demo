package com.nisum.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nisum.Employee.Employee;
import com.nisum.EmployeeDetails.EmployeeDetails;

public class Main extends EmployeeDetails {
	public static List<Employee> list = new ArrayList<>();

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("enter  your  choice:" + "\n" + "1.Create Employee" + "\n" + "2.Update Employee" + "\n"
					+ "3.Delete Employee" + "\n" + "4.GetAllEmployees"+"\n"+"5.NumberOfEmployeesByCity");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				System.out.println("enter the city");
				String city = sc.next();
				list.add(new Employee(name, id, city));
				emp.createEmployee(new Employee(name, id, city));
				break;
			case 2:
				System.out.println("enter the which id you want to update");
				int id1 = sc.nextInt();
				System.out.println("enter the name to be updated:");
				String n1 = sc.next();
				System.out.println("enter the id to be updated");
				int i1 = sc.nextInt();
				System.out.println("enter the city");
				String city1 = sc.next();
				emp.UpdateEmployee(id1, new Employee(n1, i1, city1));
				break;
			case 3:
				System.out.println("enter the id to be deleted:");
				int del = sc.nextInt();
				emp.DeleteEmployee(del);
				break;
			case 4:
				emp.getALlEmployees();
				break;
			case 5:
				System.out.println("Number of employees by City");
				emp.getNumberOfEmpInParticularCity();
			
			default:
				System.out.println("enter the valid number");
				break;
			}
			System.out.println("Do you want to exit y/n");
			c = sc.next().charAt(0);
		} while (c == 'n');
		System.out.println("Exited Successfully");
	}
}