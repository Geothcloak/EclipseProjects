package com.justin.shippingSystem.parcels;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.parcels.Parcel;

public class ParcelTest {
	Parcel parcelUnderTest;
	Address address1;
	@Before
	public void init(){
		address1 = new Address("430 home st", "sycamore", "il", "60178");
		parcelUnderTest = new Parcel("102", address1){
			@Override
			public String getType() {
				return "Parcel";
			}

			@Override
			public String specialInformation() {
				return "ok";
			}
		};
		
	}
	@Test
	public void canGetId(){
		Assert.assertEquals("102", parcelUnderTest.getId());
	}
	@Test
	public void getDestination(){
		Assert.assertEquals(address1, parcelUnderTest.getAddress());
	}
}