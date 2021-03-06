package com.justin.shippingSystem.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.Dimentions;

import com.justin.shippingSystem.calculator.CalcWeightPerFoot;

public class CalcWeightPerFootTest {
	private CalcWeightPerFoot calcWeightPerFoot;
	private Dimentions dimentions;
	private double weight;
	@Before
	public void init(){
		calcWeightPerFoot = new CalcWeightPerFoot();
		dimentions = new Dimentions(1, 2, 3);
		weight = 100;
	}
	@Test
	public void canCalcWeightPerFoot(){
		Assert.assertEquals(.06, calcWeightPerFoot.calcWeightPerFoot(dimentions, weight), .001);
	}
}
