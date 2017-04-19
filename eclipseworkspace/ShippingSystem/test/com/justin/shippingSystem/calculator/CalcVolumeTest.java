package com.justin.shippingSystem.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.Dimentions;

import com.justin.shippingSystem.calculator.CalcVolume;


public class CalcVolumeTest {
	Dimentions dimentions;
	CalcVolume calcVolume;
	@Before
	public void init(){
		dimentions = new Dimentions(1,2,3);
		calcVolume = new CalcVolume();
	}
	@Test
	public void canCalcVolume(){
		Assert.assertEquals(6, calcVolume.calcVolume(dimentions), .001);
	}
}
