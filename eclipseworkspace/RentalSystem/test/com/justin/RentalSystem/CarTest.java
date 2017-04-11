package com.justin.RentalSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Car carUnderTest;
	private Address carTestAddress;
	@Before
	public void init(){
		carTestAddress = new Address("430 test st", "test city", "tx", "60111");
		carUnderTest = new Car(carTestAddress, "chevy", "ford", "1900", 1);
		
	}
	@Test
	public void testCanGetMake(){
		Assert.assertEquals("chevy", carUnderTest.getMake());
	}
	@Test
	public void testCanGetModel(){
		Assert.assertEquals("ford", carUnderTest.getModel());
	}
	@Test
	public void testCanGetYear(){
		Assert.assertEquals("1900", carUnderTest.getYear());
	}
	@Test
	public void testCanGetMiles(){
		Assert.assertEquals( 1, carUnderTest.getMiles(), .001);
	}
	
	@Test
	public void testCanGetAddress(){
		Assert.assertEquals( carTestAddress, carUnderTest.getAddress());
	}
	
}
