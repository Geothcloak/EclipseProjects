package com.justin.RentalSystem;

public class Car{
	private Address address; 
	private String make;
	private String model;
	private String year;
	private double miles;
	public Car(Address address, String make, String model, String year, double miles){
		this.address = address; 
		this.make = make;
		this.model = model;
		this.year = year;
		this.miles = miles; // make this through a setter
	}
	
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public String getYear(){
		return year;
	}
	public double getMiles(){
		return miles;
	}
	public Address getAddress(){
		return address;
	}
	
	
	
	
}
