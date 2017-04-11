package com.justin.RentalSystem;

public class AddressReporter {
	public String printAddress(Address address) {
		//System.out.println(address.getStreetAddress() + " " + address.getCity() + " "
			//	+ address.getState() + " " + address.getZipcode() + ".");
		
		return (address.getStreetAddress() + " " + address.getCity() + " "
				+ address.getState() + " " + address.getZipcode() + ".");
	}

}
