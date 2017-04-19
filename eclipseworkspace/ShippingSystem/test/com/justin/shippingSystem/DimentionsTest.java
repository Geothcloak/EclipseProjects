package com.justin.shippingSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DimentionsTest {
	Dimentions dimentions;
	@Before
	public void init(){
		dimentions = new Dimentions(1,2,3);
	}
	@Test
	public void canGetDimentionX(){
		Assert.assertEquals(1, dimentions.getDimentionX(), .001);
	}
	@Test
	public void canGetDimentionY(){
		Assert.assertEquals(2, dimentions.getDimentionY(), .001);
	}
	@Test
	public void canGetDimentionZ(){
		Assert.assertEquals(3, dimentions.getDimentionZ(), .001);
	}
	
}
