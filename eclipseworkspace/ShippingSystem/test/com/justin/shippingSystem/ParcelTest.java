package com.justin.shippingSystem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParcelTest {
	Parcel parcelUnderTest;
	@Before
	public void init(){
		parcelUnderTest = new Parcel("102", "432 home st sycamore il");
		
	}
	@Test
	public void canWhatAmI() {
		Assert.assertEquals("Parcel", parcelUnderTest.whatAmI());
	}
	@Test
	public void canSpecialInformation(){
		Assert.assertEquals("I'm not a box or letter", parcelUnderTest.specialInformation());
	}
	@Test
	public void canGetId(){
		Assert.assertEquals("102", parcelUnderTest.getId());
	}
	@Test
	public void getDestination(){
		Assert.assertEquals("432 home st sycamore il", parcelUnderTest.getDestination());
	}
}