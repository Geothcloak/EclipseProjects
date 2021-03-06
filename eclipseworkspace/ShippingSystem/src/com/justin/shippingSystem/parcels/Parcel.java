package com.justin.shippingSystem.parcels;

import com.justin.shippingSystem.address.Address;

public abstract class Parcel {
	//final on a string makes it a constant that can be set initially or in constructor.
	private final String id;
	private Address address;
	public Parcel(String id, Address address){
		this.id = id;
		this.address = address;
	}
	public abstract String getType();
	public abstract String specialInformation();
	
	//final means i can't override
	public final String getId(){
		return id;
	}
	public Address getAddress(){
		return address;
	}
}
