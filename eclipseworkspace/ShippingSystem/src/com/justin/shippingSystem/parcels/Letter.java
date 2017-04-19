package com.justin.shippingSystem.parcels;

import com.justin.shippingSystem.address.Address;

public class Letter extends Parcel{
	private double postage;
	public Letter(String id, Address address, double postage){
		super(id, address);
		this.postage = postage;
	}
	@Override
	public String getType(){
		return "Letter";
	}
	@Override
	public String specialInformation(){
		return ("The postage is " + postage);
	}
	public double getPostage(){
		return postage;
	}
}
