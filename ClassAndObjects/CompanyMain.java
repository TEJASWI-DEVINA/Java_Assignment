package com.ltts;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company();
		Scanner s= new Scanner(System.in);
		System.out.println("Sample Input:");
		System.out.println("Enter the company name:");
		c.setName(s.nextLine());
		System.out.println("Enter the employees name:");
		c.setEmployees(s.next());
		System.out.println("Enter TeamLead:");
		c.setTeamlead(s.next());
		
		System.out.println("Sample output");
		System.out.println("Name: "+c.getName());
		System.out.println("Employee: "+c.getEmployees());
		System.out.println("Lead: "+c.getTeamlead());
	
		

	}

}
