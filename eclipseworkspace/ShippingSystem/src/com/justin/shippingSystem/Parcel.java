package com.justin.shippingSystem;

public class Parcel {
	private String id;
	private String destination;
	public Parcel(String id, String destination){
		this.id = id;
		this.destination = destination;
	}
	public String whatAmI(){
		return "Parcel";
	}
	public String specialInformation(){
		return "I'm not a box or letter";
	}
	
	public String getId(){
		return id;
	}
	public String getDestination(){
		return destination;
	}
}
