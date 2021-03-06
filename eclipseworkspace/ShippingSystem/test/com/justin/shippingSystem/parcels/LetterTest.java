package com.justin.shippingSystem.parcels;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.parcels.Letter;

public class LetterTest {
	Letter letterUnderTest;
	@Before
	public void init(){
		Address address1 = new Address("430 home st", "sycamore", "il", "60178");
		letterUnderTest = new Letter("102", address1, 3.30);
		
	}
	@Test
	public void canWhatAmI() {
		Assert.assertEquals("Letter", letterUnderTest.getType());
	}
	@Test
	public void canSpecialInformation(){
		Assert.assertEquals("The postage is 3.3", letterUnderTest.specialInformation());
	}

}