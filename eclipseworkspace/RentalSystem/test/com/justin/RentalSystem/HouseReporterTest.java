package com.justin.RentalSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HouseReporterTest {
	private Address addressUnderTest;
	private House houseUnderTest;
	private HouseReporter houseReporterUnderTest;
	@Before
	public void init(){
		addressUnderTest = new Address("430 home st", "sycamore", "il", "60178");
		houseReporterUnderTest = new HouseReporter();
		houseUnderTest = new House(addressUnderTest, 10, "red", "no fence");
	}
	@Test
	public void testCanPrintFullHouseAddress(){
		Assert.assertEquals("I live at 430 home st sycamore il 60178. it has 10.0 square feet and is red in color no fencei got fence.", houseReporterUnderTest.printAll(houseUnderTest));
	}
}
