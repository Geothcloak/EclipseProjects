package com.justin.animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	Animal animalUnderTest;
	@Before
	public void init(){
		animalUnderTest = new Animal("molly");
		
	}
	@Test
	public void testCanSayMyName(){
		Assert.assertEquals("molly", animalUnderTest.sayMyName());
	}
}
