package com.justin.shippingSystem;

public class Box extends Parcel{
	private double dimentionX;
	private double dimentionY;
	private double dimentionZ;
	public Box(String id, String destination, double dimentionX, double dimentionY, double dimentionZ){
		super(id, destination);
		this.dimentionX = dimentionX;
		this.dimentionY = dimentionY;
		this.dimentionZ = dimentionZ;
	}
	@Override
	public String whatAmI(){
		return "Box";
	}
	
	@Override
	public String specialInformation(){
		return ("The dimentions are " + dimentionX + "x" + dimentionY + "x" + dimentionZ);
	}
	
}