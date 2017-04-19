package com.justin.shippingSystem.address;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressReporterTest {
	private Address addressUnderTest;
	private AddressReporter addressReporter;
	@Before
	public void init(){
		addressReporter = new AddressReporter();
		addressUnderTest = new Address("430 home st.", "sycamore", "il", "60178");
	}
	@Test
	public void testCanBuildAddress(){
		Assert.assertEquals("430 home st. sycamore il 60178.", addressReporter.printAddress(addressUnderTest));
	}
	
	
	
}
