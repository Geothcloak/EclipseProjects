package com.justin.shippingSystem.parcels;

import com.justin.shippingSystem.Dimentions;
import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.calculator.CalcVolume;

public class Box extends Parcel{
	private Dimentions dimentions;
	private CalcVolume calcVolume;
	public Box(String id, Address address, Dimentions dimentions){
		super(id, address);
		this.dimentions = dimentions;
		calcVolume = new CalcVolume();
	}
	@Override
	public String getType(){
		return "Box";
	}
	
	@Override
	public String specialInformation(){
		
		//TODO:Justin MAKE STRING BUILDER HERE
		return ("The dimentions are " + dimentions.getDimentionX() + "x" 
		+ dimentions.getDimentionY() + "x" + dimentions.getDimentionZ()
		+ " the volume is " + calcVolume.calcVolume(dimentions));
		
	}
	
}