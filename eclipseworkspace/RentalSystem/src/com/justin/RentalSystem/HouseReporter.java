package com.justin.RentalSystem;

public class HouseReporter {
	public String printAll(House house) {
		String fullAddressPrinted;
		AddressReporter addressReporter = new AddressReporter();
		
		fullAddressPrinted = ("I live at " + addressReporter.printAddress(house.getAddress()) + " it has "
				+ house.getSquareFeet() + " square feet and is " + house.getColor() + " in color " + house.getFence()
				+ "i got fence.");
						
		System.out.println(fullAddressPrinted);
		return (fullAddressPrinted);
	}

}
