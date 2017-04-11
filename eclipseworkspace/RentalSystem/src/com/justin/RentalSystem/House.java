package com.justin.RentalSystem;

public class House {
	
	private Address address;
	private double squareFeet;
	private String color;
	private String fence;

	public House(Address address, double squareFeet, String color, String fence) {
		this.address = address;
		this.squareFeet = squareFeet;
		this.color = color;
		this.fence = fence;
	}

	public Address getAddress() {
		return address;
	
	}

	public double getSquareFeet() {
		return squareFeet;
	}

	public String getColor() {
		return color;
	}
	
	public String getFence() {
		return fence;
	}
	// address, square feet, color,

}
