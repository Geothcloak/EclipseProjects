package com.justin.shippingSystem;

public class Letter extends Parcel{
	private double postage;
	public Letter(String id, String destination, double postage){
		super(id, destination);
		this.postage = postage;
	}
	@Override
	public String whatAmI(){
		return "Letter";
	}
	@Override
	public String specialInformation(){
		return ("The postage is " + postage);
	}
}
