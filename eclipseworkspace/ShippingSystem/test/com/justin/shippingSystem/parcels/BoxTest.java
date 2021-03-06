package com.justin.shippingSystem.parcels;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.Dimentions;
import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.parcels.Box;

public class BoxTest {
	Box boxUnderTest;
	@Before
	public void init(){
		Address address1 = new Address("430 home st", "sycamore", "il", "60178");
		Dimentions dimention1 = new Dimentions(10,11,1);
		boxUnderTest = new Box("100", address1, dimention1);
		
	}
	@Test
	public void canWhatAmI() {
		Assert.assertEquals("Box", boxUnderTest.getType());
	}
	@Test
	public void canSpecialInformation(){
		Assert.assertEquals("The dimentions are 10.0x11.0x1.0 the volume is 110.0", boxUnderTest.specialInformation());
	}

}
