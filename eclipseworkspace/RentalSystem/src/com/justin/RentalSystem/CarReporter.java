package com.justin.RentalSystem;

public class CarReporter {

	public String printAll(Car car){
		AddressReporter addressReporter = new AddressReporter();
		String fullCarInformation = ("My car lives at " + addressReporter.printAddress(car.getAddress()) + "This is the make " + car.getMake() + " This is the Model " + car.getModel()
		+ " This is the year " + car.getYear() + " this is how many miles " + car.getMiles());
				
		System.out.println(fullCarInformation);
		
		return (fullCarInformation);
	}


	public static void main(String[] args) {
		CarReporter carReporter = new CarReporter();
		HouseReporter houseReporter = new HouseReporter();
		
		
		
		//Car car = new Car();
		//House house = new House();

		//carReporter.printAll(car);
		//houseReporter.printAll(house);
		Address jeepAddress = new Address("430 Home St.", "Sycamore", "IL", "60178");
		Address fordAddress = new Address("431 Homes St.", "Syyscamore", "ILs", "61178");
		
		Car carJeepCompass = new Car(jeepAddress, "Jeep", "Compass", "1920", 100);
		Car carFordWrangler = new Car(fordAddress, "Ford", "Wrangler", "1930", 10000);
		
		Address homeOneAddress = new Address("69 bonesaw st.", "hell", "texas", "666");
		Address homeTwoAddress = new Address("121212 tweleve st.", "12", "twevele", "121212");
		
		House houseOne = new House(homeOneAddress, 10000, "black as fuck", " decapitated head fence.");
		House houseTwo = new House(homeTwoAddress, 121212, "1212", " 12 fences");
		
		
		
		/*
		carReporter.printAll(carJeepCompass);
		System.out.println("");
		carReporter.printAll(carFordWrangler);
		System.out.println("");
		houseReporter.printAll(houseOne);
		System.out.println("");
		houseReporter.printAll(houseTwo);
		System.out.println("");
		*/
		
		/////////////////////rental manager //////////////////////
		RentalManager rentalManager = new RentalManager();
		System.out.println(rentalManager.howManyCars()); 
		rentalManager.addToRentalManager(carJeepCompass);
		System.out.println(rentalManager.howManyCars()); 
		
		
		
	}
}
