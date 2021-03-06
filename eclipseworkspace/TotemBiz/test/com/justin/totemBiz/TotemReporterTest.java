package com.justin.totemBiz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.linkedlist.LinkedList;

public class TotemReporterTest {
	TotemReporter totemReporterUnderTest;
	
	
	Totem totemUnderTest1;
	Totem totemUnderTest2;
	Totem totemUnderTest3;
	Totem totemUnderTest4;
	LinkedList linkedListUnderTest;
	
	@Before
	public void init(){
		totemReporterUnderTest = new TotemReporter();
		
		totemUnderTest1 = new Totem(3f, "justin", "wood", 4);
		totemUnderTest2 = new Totem(2f, "justin", "wood", 2);
		totemUnderTest3 = new Totem(1f, "justin", "wood", 3);
		totemUnderTest4 = new Totem(4f, "justin", "wood", 1);
		linkedListUnderTest = new LinkedList(totemUnderTest1);
		linkedListUnderTest.add(totemUnderTest2);
		linkedListUnderTest.add(totemUnderTest3);
		linkedListUnderTest.add(totemUnderTest4);
	}
	
	@Test
	public void canPrintToConsole(){
		Assert.assertEquals( "height: 3.0 name: justin material: wood number of spirits: 4\n" +
				"height: 2.0 name: justin material: wood number of spirits: 2\n" +
				"height: 1.0 name: justin material: wood number of spirits: 3\n" +
				"height: 4.0 name: justin material: wood number of spirits: 1\n", 
				
				totemReporterUnderTest.printToConsole(linkedListUnderTest));
	}
	
}
