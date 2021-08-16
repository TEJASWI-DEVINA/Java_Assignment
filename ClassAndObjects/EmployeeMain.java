package com.ltts;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter the name:");
		emp.setName(sc.next());
		System.out.println("Enter Address:");
		emp.setAddress(sc.next());
		System.out.println("Enter Mobile:");
		emp.setMobile(sc.next());
		System.out.println("Employee Details");
		System.out.println("Name: "+emp.getName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("Mobile: "+emp.getMobile());
		while(true){
		
		System.out.println("Verify and Update the details:");
		System.out.println("Menu");
		System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n 4.All information correct/Exit");
		int a=sc.nextInt();
	
		if(a==1) {
			System.out.println("Current Name is: "+emp.getName());
			System.out.println("Enter the name");
			emp.setName(sc.next());
		}
		else if(a==2) {
			System.out.println("Current Address is: "+emp.getAddress());
			System.out.println("Enter the Address");
			emp.setAddress(sc.next());
		}
		else if(a==3) {
			System.out.println("Current Mobile number is: "+emp.getMobile());
			System.out.println("Enter the Mobile Number");
			emp.setMobile(sc.next());
		}
		else if(a==4) {
			System.out.println("The details are:");
			System.out.println("Name: "+emp.getName());
			System.out.println("Address: "+emp.getAddress());
			System.out.println("Mobile: "+emp.getMobile());
			break;
				
		}
		}
	}

}
