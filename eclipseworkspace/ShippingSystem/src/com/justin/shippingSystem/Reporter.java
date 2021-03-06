package com.justin.shippingSystem;

import java.util.ArrayList;
import java.util.List;

import com.justin.shippingSystem.address.AddressReporter;
import com.justin.shippingSystem.parcels.Parcel;

public class Reporter {
	List<Parcel> parcels;
	
	public Reporter(){
		parcels = new ArrayList<>();
	}
	
	public Parcel setParcels(List<Parcel> managePackages){
		this.parcels = managePackages;
		return managePackages.get(0);
	}
	
	public String printParcels(){
		AddressReporter addressReporter = new AddressReporter();
		
		StringBuilder stringBuilder = new StringBuilder();
		for(int count = 0; count < parcels.size(); count++){
			
			stringBuilder.append(parcels.get(count).getType());
			stringBuilder.append(" id:").append(parcels.get(count).getId());
			stringBuilder.append(" ").append(addressReporter.printAddress(parcels.get(count).getAddress()));
			stringBuilder.append(" ").append(parcels.get(count).specialInformation()).append("\n");
			
		}
		return stringBuilder.toString();
	}
}
