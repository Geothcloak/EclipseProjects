package com.justin.shippingSystem.address;

public class AddressReporter {
	public String printAddress(Address address) {
		//System.out.println(address.getStreetAddress() + " " + address.getCity() + " "
			//	+ address.getState() + " " + address.getZipcode() + ".");
		
		//TODO:Justin MAKE STRING BUILDER HERE
		return (address.getStreetAddress() + " " + address.getCity() + " "
				+ address.getState() + " " + address.getZipcode() + ".");
	}

}
