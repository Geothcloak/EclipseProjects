package com.justin.dcompany;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HourlyTest {
	Hourly hourly;
	@Before
	public void init(){
		hourly = new Hourly("joe", 1, "grocery", 80, 8.25);
	
	}
	@Test
	public void canCalcPayCheck(){
		Assert.assertEquals(660, hourly.CalculatePayCheck(), .01);
	}
}
