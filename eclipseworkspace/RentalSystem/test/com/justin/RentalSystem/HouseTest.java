package com.justin.RentalSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HouseTest {
	private House houseUnderTest;
	private Address houseTestAddress;
	@Before
	public void init(){
		houseTestAddress = new Address("666 hell st.", "hell", "he", "666");
		houseUnderTest = new House(houseTestAddress, 666, "red", "metal fence");
	}
	
	@Test
	public void testCanGetSquareFeet(){
		Assert.assertEquals(666, houseUnderTest.getSquareFeet(), .001);
	}
	@Test
	public void testCanGetColor(){
		Assert.assertEquals("red", houseUnderTest.getColor());
	}
	@Test
	public void testCanGetFence(){
		Assert.assertEquals("metal fence", houseUnderTest.getFence());
	}
	@Test
	public void testCanGetAddress(){
		Assert.assertEquals(houseTestAddress, houseUnderTest.getAddress());
	}
}
