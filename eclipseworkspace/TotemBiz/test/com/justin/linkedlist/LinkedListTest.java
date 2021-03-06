package com.justin.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.totemBiz.Totem;
import com.justin.totemBiz.TotemReporter;

import com.justin.linkedlist.LinkedList;

public class LinkedListTest {
	Totem totemUnderTest1;
	Totem totemUnderTest2;
	Totem totemUnderTest3;
	Totem totemUnderTest4;
	LinkedList linkedListUnderTest;
	TotemReporter totemReporterUnderTest;
	@Before
	public void init(){
		totemReporterUnderTest = new TotemReporter();
		totemUnderTest1 = new Totem(6.2f, "justin", "wood", 1);
		totemUnderTest2 = new Totem(6.2f, "justin", "wood", 2);
		totemUnderTest3 = new Totem(6.2f, "justin", "wood", 3);
		totemUnderTest4 = new Totem(6.2f, "justin", "wood", 4);
		linkedListUnderTest = new LinkedList(totemUnderTest1);
		
		linkedListUnderTest.add(totemUnderTest1);
		linkedListUnderTest.add(totemUnderTest2);
		linkedListUnderTest.add(totemUnderTest3);
		linkedListUnderTest.add(totemUnderTest4);
		
	}
	@Test
	public void canAddToLinkedList(){
		int before = linkedListUnderTest.size();
		linkedListUnderTest.add(totemUnderTest1);
		int after = linkedListUnderTest.size();
		Assert.assertEquals(1, after - before);
	}
	@Test
	public void canRemoveHead(){
		int before = linkedListUnderTest.size();
		linkedListUnderTest.remove(0);
		int after = linkedListUnderTest.size();
		Assert.assertEquals(1, before - after);
		
	}
	@Test
	public void canRemoveMiddle(){
		int before = linkedListUnderTest.size();
		linkedListUnderTest.remove(2);
		int after = linkedListUnderTest.size();
		Assert.assertEquals(1, before - after);
	}
	@Test
	public void canRemoveEnd(){
		int before = linkedListUnderTest.size();
		linkedListUnderTest.remove(3);
		int after = linkedListUnderTest.size();
		Assert.assertEquals(1, before - after);
	}
	@Test
	public void canSize(){
		Assert.assertEquals(5, linkedListUnderTest.size());
	}
}
