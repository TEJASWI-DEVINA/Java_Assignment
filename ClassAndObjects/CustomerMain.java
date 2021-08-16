package com.ltts;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Scanner sc= new Scanner(System.in);
		System.out.println("Sample Input:");
		System.out.println("Enter the details:");
		String d[]=new String[3];
		d=sc.next().split(",");
		c.setName(d[0]);
		c.setAddress(d[1]);
		c.setMobile(d[2]);
		
		
		System.out.println("Sample Output");
		System.out.println("Name: "+d[0]);
		System.out.println("Address: "+d[1]);
		System.out.println("Mobile: "+d[2]);
		
		sc.close();

	}

}
