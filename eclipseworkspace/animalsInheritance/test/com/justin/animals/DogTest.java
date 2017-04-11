package com.justin.animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
	
	Dog dogUnderTest;
	
	@Before
	public void init(){
		dogUnderTest = new Dog("benny");
	}
	@Test
	public void testDogExtendsAnimal(){
		Assert.assertEquals("barkbarkbark", dogUnderTest.sayMyName());
	}
	@Test
	public void testCanDogEatBone(){
		Assert.assertEquals("he ate a bone", dogUnderTest.eatABone());
	}
	@Test
	public void testDogIsAnimal(){
		Animal animal = new Dog("George Castanza");
		
		Assert.assertEquals(" ", animal.sayMyName());
		
		Dog dog = (Dog)animal;
		// now dog can bark because it can now cast.
	}
	
}
