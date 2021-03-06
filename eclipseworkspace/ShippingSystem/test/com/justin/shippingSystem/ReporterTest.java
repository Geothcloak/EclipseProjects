package com.justin.shippingSystem;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.parcels.Box;
import com.justin.shippingSystem.parcels.Letter;
import com.justin.shippingSystem.parcels.Parcel;



public class ReporterTest {
	List<Parcel> listToTest;
	Reporter reporterUnderTest;
	@Before
	public void init(){
		listToTest = new ArrayList<>();
		reporterUnderTest = new Reporter();
		Address address1 = new Address("430 home st", "sycamore", "il", "60178");
		Dimentions dimention1 = new Dimentions(10,11,1);
		
		Parcel parcel1 = new Box("100", address1, dimention1);
		Parcel parcel2 = new Box("101", address1, dimention1);
		Parcel parcel3 = new Letter("102", address1, 3.30);
		Parcel parcel4 = new Letter("103", address1, 6.60);
		listToTest.add(parcel1);
		listToTest.add(parcel2);
		listToTest.add(parcel3);
		listToTest.add(parcel4);
		
		//Assert.assertEquals(" ", animal.sayMyName());
	}
	@Test
	public void testCanTakeList() {
		Assert.assertEquals(listToTest.get(0), reporterUnderTest.setParcels(listToTest));
	}
	@Test
	public void testCanPrintParcels() {
		reporterUnderTest.setParcels(listToTest);
		Assert.assertEquals("Box id:100 430 home st sycamore il 60178. The dimentions are 10.0x11.0x1.0 the volume is 110.0\n" +
							"Box id:101 430 home st sycamore il 60178. The dimentions are 10.0x11.0x1.0 the volume is 110.0\n"+
							"Letter id:102 430 home st sycamore il 60178. The postage is 3.3\n"+
							"Letter id:103 430 home st sycamore il 60178. The postage is 6.6\n", 
							reporterUnderTest.printParcels());
	}
	
}
