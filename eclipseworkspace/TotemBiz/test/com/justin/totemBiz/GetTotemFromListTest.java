package com.justin.totemBiz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.linkedlist.LinkedList;

public class GetTotemFromListTest {
	Totem totemUnderTest1;
	Totem totemUnderTest2;
	Totem totemUnderTest3;
	Totem totemUnderTest4;
	LinkedList linkedListUnderTest;
	GetTotemFromList getTotemFromList;
	
	@Before
	public void init(){
		getTotemFromList = new GetTotemFromList();
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
	public void canSearchByNameNotFound(){
		Assert.assertEquals(null, getTotemFromList.byName(linkedListUnderTest, "dalton"));
	}
	@Test
	public void canSearchByNameDuplicate(){
		//TODO
		//should i return just the first one or should i continue searching and alert that there are more than one
		Assert.assertEquals(totemUnderTest1, getTotemFromList.byName(linkedListUnderTest, "justin"));
	}
	@Test
	public void canSearchByNameJustOne(){
		totemUnderTest1.setName("notjustin");
		Assert.assertEquals(totemUnderTest2, getTotemFromList.byName(linkedListUnderTest, "justin"));
	}
}
