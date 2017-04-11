package com.justin.RentalSystem;

import java.util.ArrayList;
import java.util.List;

public class RentalManager {
	private List<Car> manageCars;
	
	private House[] manageHouses;
	private int houseNextIndex;
	
	public RentalManager(){
		manageCars = new ArrayList<>();
		
		manageHouses = new House[10];
		houseNextIndex = 0;
	}
	
	
	//send me a car and ill add that sucker to the list
	public Car addToRentalManager(Car carToAdd){
		manageCars.add(carToAdd);
		
		return carToAdd;
	}
	//send me a house and ill add that sucker to the list
	public House addToRentalManager(House houseToAdd){
		if (houseNextIndex < 10){
			manageHouses[houseNextIndex] = houseToAdd;
			++houseNextIndex;
			return(manageHouses[houseNextIndex -1]);
		}else{
			System.out.println("too many houses inside rental manager. unable to add the house.");
		}
			return null;
	}
	
	//ask me how many cars or houses i have and ill send you a number
	public int howManyCars(){
		return(manageCars.size());
	}
	public int howManyHouses(){
		return(houseNextIndex);
	}
	
}
