package com.ltts;

import java.util.Scanner;

class HotelRoom{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {

		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	int calculateTariff(int rate) {
		
		return this.numberOfSqFeet*rate;
	}
	int getRatePerSqFeet() {
		return 0;
	}
	
}

class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		super(hotelName,numberOfSqFeet,hasTV, hasWifi);
		this.ratePerSqFeet=10;
		}

	public int getRatePerSqFeet() {
		if (this.hasWifi) {
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
}

class DeluxeACRoom extends DeluxeRoom{
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		super(hotelName,numberOfSqFeet,hasTV, hasWifi);
		this.ratePerSqFeet=12;	
	}
}

class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		super(hotelName,numberOfSqFeet,hasTV, hasWifi);
		this.ratePerSqFeet=15;
		}
	public int getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	
	
	
	
}

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1.Deluxe Room\n2.Deluxe AC Room\n3.Suite AC Room");
		System.out.println("Select Room Type");
		int t=sc.nextInt();
		System.out.println("Hotel Name:");
		String name= sc.next();
		System.out.println("Room Square Feet Area:");
		int feets=sc.nextInt();
		boolean tv;
		System.out.println("Room has TV (yes/no):");
		String ttvv=sc.next();
		tv=(("yes").equals(ttvv))? true:false;
		boolean wi;
		System.out.println("Room has Wifi (yes/no):");
		String wwii=sc.next();
		wi=(("yes").equals(wwii))? true:false;
		if(t==1) {
			DeluxeRoom d=new DeluxeRoom(name,feets,tv,wi);
			int cost =d.calculateTariff(d.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+ cost);
			
		}
		else if(t==2) {
			DeluxeACRoom dAC=new DeluxeACRoom(name,feets,tv,wi);
			int cost =dAC.calculateTariff(dAC.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+ cost);
		}
		else if(t==3) {
			
			SuiteACRoom sAC=new SuiteACRoom(name,feets,tv,wi);
			int cost =sAC.calculateTariff(sAC.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+ cost);
		}
		
	sc.close();	
	}

}
