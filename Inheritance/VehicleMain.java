package com.ltts;

import java.util.Scanner;



class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc){
	this.make=make;
	this.vehicleNumber=vehicleNumber;
	this.fuelType=fuelType;
	this.fuelCapacity=fuelCapacity;
	this.cc=cc;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void displayMake() {
		System.out.println("***"+getMake()+"***");
	}
	public void BasicInfo() {
		System.out.println("---Basic Information---");
		System.out.println("Vehicle number: "+getVehicleNumber());
		System.out.println("Fuel Capacity: "+getFuelCapacity());
		System.out.println("Fuel Type: "+getFuelType());
		System.out.println("CC: "+getCc());
}
	
}	


class TwoWheeler extends Vehicle{
	
	private boolean kickStartAvailable;

	TwoWheeler(String make,String vehicleNumber,String fuelType, int fuelCapacity,int cc){
		super( make,vehicleNumber,fuelType, fuelCapacity,cc);
	}
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	void displayDetailInfo() {
		System.out.println("-----Detail Information-----");
		String z="";
		z=(isKickStartAvailable())? ("YES"): ("NO");
		System.out.println("Kick Start Available: "+ z);
		
	}
}

class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	FourWheeler(String make,String vehicleNumber,String fuelType, int fuelCapacity,int cc){
		super( make,vehicleNumber,fuelType, fuelCapacity,cc);
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("Number of Doors:"+getNumberOfDoors());
		
	}
}


public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("1.Four Wheeler\n2.Two Wheeler");
	 System.out.println("Enter Vehicle Type ");
	 int a= sc.nextInt();
	 System.out.println("Vehicle Make:");
	 String m=sc.next();
	 System.out.println("Vehicle NUmber:");
	 String Num=sc.next();
	 System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
	 int f=sc.nextInt();
	 String fType="";
	 if(f==1) {
		 fType="Petrol";
	 }
	 else if(f==2) {
		 fType="Diesel";
	 }
	 System.out.println("Fuel Capacity:");
	 int fCap=sc.nextInt();
	 System.out.println("Engine CC: ");
	 int engC=sc.nextInt();
	 if (a==2) {
		
		 
		 TwoWheeler t= new TwoWheeler(m,Num,fType,fCap,engC);
		 System.out.println("Kick Start Available(yes/no):");
		 String k= sc.next();
		 t.setKickStartAvailable(k.equals("yes"));
		 t.displayMake();
		 t.BasicInfo();
		 t.displayDetailInfo();
		 
		 
		 
	 }
	 else if(a==1) {
		 
		 FourWheeler fo= new FourWheeler(m,Num,fType,fCap,engC);
		 System.out.println("Audio System:");
		 String k= sc.next();
		 System.out.println("Number of Doors:");
		 int nd=sc.nextInt();
		 fo.setAudioSystem(k);
		 fo.setNumberOfDoors(nd);
		 fo.displayMake();
		 fo.BasicInfo();
		 fo.displayDetailInfo();
		 
		 
	 }
		

	}

}
