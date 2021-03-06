package com.justin.dcompany;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SalariedTest {
	Salaried salaried;
	Salaried salaried1;
	Salaried salaried2;
	
	@Before
	public void init(){
	salaried = new Salaried("joe", 1, "grocery", 2600);
	RewardSystem rewardSystem = new RewardSystem();
	
	salaried1 = new Salaried("joe", 1, "grocery", 2600, rewardSystem);
	salaried2 = new Salaried("joe", 1, "grocery", 2600, rewardSystem);
	
	} 
	@Test
	public void canCalcPayCheck(){
		Assert.assertEquals(576.92, salaried.CalculatePayCheck(), .01);
	}
}
