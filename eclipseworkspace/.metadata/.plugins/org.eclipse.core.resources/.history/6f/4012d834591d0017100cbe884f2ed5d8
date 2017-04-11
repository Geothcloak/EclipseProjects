package com.justin.RentalSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarReporterTest {

	private Car carUnderTest;
	private CarReporter carReporterUnderTest;
	private Address carAddressUnderTest;

	@Before
	public void init() {
		carAddressUnderTest = new Address("430 home st", "sycamore", "il", "60178");
		carUnderTest = new Car(carAddressUnderTest, "Chevy", "Pistol", "1800", 100);
		carReporterUnderTest = new CarReporter();
	}

	@Test
	public void testCanPrintFullCarInformation() {
		Assert.assertEquals(
				"My car lives at 430 home st sycamore il 60178.This is the make Chevy This is the Model Pistol This is the year 1800 this is how many miles 100.0",
				carReporterUnderTest.printAll(carUnderTest));
	}
}
