package com.justin.RentalSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RentalManagerTest {
	private House houseUnderTest;
	private Address houseTestAddress;
	
	private Car carUnderTest;
	private Address carTestAddress;
	
	private RentalManager rentalManagerUnderTest;
	
	@Before
	public void init(){
		houseTestAddress = new Address("666 hell st.", "hell", "he", "666");
		houseUnderTest = new House(houseTestAddress, 666, "red", "metal fence");
		
		carTestAddress = new Address("430 test st", "test city", "tx", "60111");
		carUnderTest = new Car(carTestAddress, "chevy", "ford", "1900", 1);
		
		rentalManagerUnderTest = new RentalManager();	
	}
	@Test
	public void testAddToRentalManagerCar(){
		Assert.assertEquals(carUnderTest, rentalManagerUnderTest.addToRentalManager(carUnderTest));
	}
	@Test
	public void testAddToRentalManagerHouse(){
		Assert.assertEquals(houseUnderTest, rentalManagerUnderTest.addToRentalManager(houseUnderTest));
	}
	@Test
	public void testHowManyCars(){
		Assert.assertEquals(0, rentalManagerUnderTest.howManyCars());
		rentalManagerUnderTest.addToRentalManager(carUnderTest);
		Assert.assertEquals(1, rentalManagerUnderTest.howManyCars());
	}
	@Test
	public void testHowManyHouses(){
		Assert.assertEquals(0, rentalManagerUnderTest.howManyHouses());
		rentalManagerUnderTest.addToRentalManager(houseUnderTest);
		Assert.assertEquals(1, rentalManagerUnderTest.howManyHouses());
	}
	@Test
	public void testTooManyHousesElseBranch(){
		for(int i = 1; i<15; i++){
			rentalManagerUnderTest.addToRentalManager(houseUnderTest);
		}
		Assert.assertEquals(null, rentalManagerUnderTest.addToRentalManager(houseUnderTest));
	}
}
