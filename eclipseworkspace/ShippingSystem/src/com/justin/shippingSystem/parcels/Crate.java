package com.justin.shippingSystem.parcels;

import com.justin.shippingSystem.Dimentions;
import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.calculator.CalcVolume;
import com.justin.shippingSystem.calculator.CalcWeightPerFoot;

public class Crate extends Parcel{
	private Dimentions dimentions;
	private String material;
	private double weight;
	private CalcVolume calcVolume;
	private CalcWeightPerFoot calcWeightPerFoot;
	
	public Crate(String id, Address address, Dimentions dimentions, String material, double weight){
		super(id, address);
		this.dimentions = dimentions;
		this.material = material;
		this.weight = weight;
		calcVolume = new CalcVolume();
		calcWeightPerFoot = new CalcWeightPerFoot();
	}
	@Override
	public String getType(){
		return "Crate";
	}
	
	@Override
	public String specialInformation(){
		
		//TODO:Justin MAKE STRING BUILDER
		//StringBuilder stringBuilder = new StringBuilder();
	//	stringBuilder.append("The dimentions are ").append(dimentions.getDimentionX());
		//stringBuilder.append()
		return ("The dimentions are " + dimentions.getDimentionX() + "x"
		+ dimentions.getDimentionY() + "x" + dimentions.getDimentionZ()
		+ "its weight in lbs " +  weight + " its material is "
		+ material + " the Volume is " + calcVolume.calcVolume(dimentions)
		+ " the weight per foot is " + calcWeightPerFoot.calcWeightPerFoot(dimentions, weight));
		
	}
	public Dimentions getDimention() {
		return dimentions;
	}
	
}