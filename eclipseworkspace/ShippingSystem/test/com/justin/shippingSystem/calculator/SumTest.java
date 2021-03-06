package com.justin.shippingSystem.calculator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.Dimentions;
import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.calculator.Sum;
import com.justin.shippingSystem.parcels.Crate;
import com.justin.shippingSystem.parcels.Letter;
import com.justin.shippingSystem.parcels.Parcel;

public class SumTest {
	List<Parcel> listToTest;
	Sum sum;
	@Before
	public void init(){
		sum = new Sum();
		listToTest = new ArrayList<>();
		Address address1 = new Address("430 home st", "sycamore", "il", "60178");
		Dimentions dimention1 = new Dimentions(10,11,1);
		
		Parcel parcel1 = new Crate("100", address1, dimention1, "wood", 50);
		Parcel parcel2 = new Crate("101", address1, dimention1, "steel", 5000);
		Parcel parcel3 = new Letter("102", address1, 3.30);
		Parcel parcel4 = new Letter("103", address1, 6.60);
		listToTest.add(parcel1);
		listToTest.add(parcel2);
		listToTest.add(parcel3);
		listToTest.add(parcel4);
	}
	@Test
	public void canSumAllPostage(){
		Assert.assertEquals(9.90, sum.sumLetterPostage(listToTest), .001);
	}
	@Test
	public void canSumAllWeight(){
		Assert.assertEquals(220, sum.sumCrateWeight(listToTest), .001);
	}
}
